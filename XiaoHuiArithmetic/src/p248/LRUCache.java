package p248;

import java.util.HashMap;

public class LRUCache {
    private Node head;
    private Node end;

    //缓存存储上限
    private int limit;

    private HashMap<String, Node> hashMap;

    public LRUCache(int limit) {
        this.limit = limit;
        hashMap = new HashMap<>();
    }

    public void put(String key, String value) {
        Node node = hashMap.get(key);
        if (node == null) {
            //如果key不存在，则插入Key-Value
            if (hashMap.size() >= limit) {
                String oldKey = removeNode(head);
                hashMap.remove(oldKey);
            }
            node = new Node(key, value);
            addNode(node);
            hashMap.put(key,node);
        }else {
            //如果Key不存在，则刷新Key-Value
            node.value = value;
            refreshNode(node);
        }
    }

    /**
     * 刷新被访问的节点位置
     * @param node  被访问的节点
     */
    private void refreshNode(Node node) {
        //如果访问的是尾节点，则无须移动节点
        if (node==end){
            return;//表示不执行下面的东西，方法到这里结束。
        }
        //移除节点
        removeNode(node);
        //重新插入节点
        addNode(node);
    }

    /**
     * 尾部插入节点
     * @param node  要插入的节点
     */
    private void addNode(Node node) {
        if (end!=null){
            end.next = node;
            node.pre = end;
            node.next = null;
        }
        end = node;
        if (head == null){
            head = node;
        }
    }

    /**
     * 删除节点
     *
     * @param node 要删除的节点
     * @return
     */
    private String removeNode(Node node) {
        if (node == head && node == end) {
            //移除唯一的节点
            head = null;
            end = null;
        } else if (node == end) {
            //移除尾节点
            end = end.pre;
            end.next = null;
        } else if (node == head) {
            //移除头节点
            head = head.next;
            head.pre = null;
        } else {
            //移除中间节点
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        return node.key;
    }

    public String get(String key) {
        Node node = hashMap.get(key);
        if (node == null){
            return null;
        }
        refreshNode(node);
        return node.value;
    }
}
