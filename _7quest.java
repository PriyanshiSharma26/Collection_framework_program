//Create a HashMap with 3 product names as keys and their prices as values. Update the price of one product and display the updated map.

import java.util.HashMap;

public class _7quest {
    public static void main(String[] args)
     {
        HashMap <String,Integer> hm=new HashMap<>();
        hm.put("book",500);
        hm.put( "pen",1000);
        hm.put( "pencil",1200);
        hm.put("papers",1600);

        System.out.println(hm);

        hm.put("papers", 700);

        System.out.println(hm);
        hm.forEach((keys,value)-> {
            System.out.println("product :"+keys+"price is "+value);

        });

        
    }
    
}
