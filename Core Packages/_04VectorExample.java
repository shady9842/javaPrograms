import java.util.Vector;

class _04VectorExample{
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<Integer>();

        //insert
        for (int i = 1; i <= 10; i++) {
            vec.add(i);
        }

        //display
        System.out.println(vec);
        System.out.println("item at index 5= "+vec.get(5));

        //remove
        vec.remove(5);
        System.out.println("After removing item from index 5:");
        System.out.println(vec);

        //size
        System.out.println("Size of vector is: "+vec.size());

        //clear
        vec.clear();
        System.out.println("After clearing vector object");
        System.out.println(vec);
    }
}