package p248;

public class Node {
    public String key;
    public String value;
    public Node pre;
    public Node next;

    Node(String key, String value){
        this.key = key;
        this.value = value;
    }
}
