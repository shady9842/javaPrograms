import java.util.ArrayList;
import java.util.List;

public class _03ListInterface {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println("item at index 1 is:"+list.get(1));

        System.out.println("Size of list:"+list.size());

        list.clear();
        System.out.println("After removing all items");
        System.out.println(list);
    }
    
}
