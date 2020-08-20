package p248;

import java.util.HashMap;

public class LRUCache {
    private Node head;
    private Node end;

    //����洢����
    private int limit;

    private HashMap<String, Node> hashMap;

    public LRUCache(int limit) {
        this.limit = limit;
        hashMap = new HashMap<>();
    }

    public void put(String key, String value) {
        Node node = hashMap.get(key);
        if (node == null) {
            //���key�����ڣ������Key-Value
            if (hashMap.size() >= limit) {
                String oldKey = removeNode(head);
                hashMap.remove(oldKey);
            }
            node = new Node(key, value);
            addNode(node);
            hashMap.put(key,node);
        }else {
            //���Key�����ڣ���ˢ��Key-Value
            node.value = value;
            refreshNode(node);
        }
    }

    /**
     * ˢ�±����ʵĽڵ�λ��
     * @param node  �����ʵĽڵ�
     */
    private void refreshNode(Node node) {
        //������ʵ���β�ڵ㣬�������ƶ��ڵ�
        if (node==end){
            return;//��ʾ��ִ������Ķ��������������������
        }
        //�Ƴ��ڵ�
        removeNode(node);
        //���²���ڵ�
        addNode(node);
    }

    /**
     * β������ڵ�
     * @param node  Ҫ����Ľڵ�
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
     * ɾ���ڵ�
     *
     * @param node Ҫɾ���Ľڵ�
     * @return
     */
    private String removeNode(Node node) {
        if (node == head && node == end) {
            //�Ƴ�Ψһ�Ľڵ�
            head = null;
            end = null;
        } else if (node == end) {
            //�Ƴ�β�ڵ�
            end = end.pre;
            end.next = null;
        } else if (node == head) {
            //�Ƴ�ͷ�ڵ�
            head = head.next;
            head.pre = null;
        } else {
            //�Ƴ��м�ڵ�
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
