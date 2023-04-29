import java.util.HashMap;
public class _07HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Saugat",10);
        hm.put("Dipak",11);
        hm.put("Jason",12);

        System.out.println(hm);
        System.out.println("Size of hm is: "+hm.size());

        if(hm.containsKey("Dipak")){
            Integer a=hm.get("Dipak");
            System.out.println("Value for key \"Dipak\" is "+a );
        }

        hm.clear();
        System.out.println("After clearing:");
        System.out.println(hm);

    }
    
}
