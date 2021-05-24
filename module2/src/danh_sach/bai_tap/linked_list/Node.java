package danh_sach.bai_tap.linked_list;

public class Node {
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
