package p248;

public class LRUTest {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put("001","�û�1��Ϣ");
        lruCache.put("002","�û�2��Ϣ");
        lruCache.put("003","�û�3��Ϣ");
        lruCache.put("004","�û�4��Ϣ");
        lruCache.put("005","�û�5��Ϣ");
        lruCache.get("002");
        lruCache.put("004","�û�2��Ϣ����");
        lruCache.put("006","�û�6��Ϣ");
        System.out.println(lruCache.get("001"));
        System.out.println(lruCache.get("006"));
    }
}
