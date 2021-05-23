package danh_sach.bai_tap.my_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("nguyễn");
        list.add("thị");
        list.add("thảo");
        list.add("ly");

        print(list.getData());
        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("có"));
        list.remove(1);
        list.add("thị",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("nguyễn"));
        System.out.println(clone.contains("thị"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
