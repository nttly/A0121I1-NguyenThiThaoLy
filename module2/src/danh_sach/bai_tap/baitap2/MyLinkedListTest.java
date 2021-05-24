package danh_sach.bai_tap.baitap2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Shape> shapeMyLinkedList = new MyLinkedList<>();
        Shape a = new Shape("tròn", "có bán kính");
        Shape b = new Shape("vuông", "có 4 cạnh");
        Shape c = new Shape("tam giác", "có 3 cạnh");
        shapeMyLinkedList.addFirst(a);
        shapeMyLinkedList.addFirst(b);
        shapeMyLinkedList.remove(a);
        shapeMyLinkedList.clear();
        System.out.println(shapeMyLinkedList.indexOf(a));
        for (int i = 0; i < shapeMyLinkedList.size(); i++) {
            System.out.println(shapeMyLinkedList.get(i).toString());
        }
    }

}
