//Create an ArrayList of 5 city names, sort them in alphabetical order, and print the sorted list.
                                //IF OUR CASE IS INSENSITIVE 
import java.util.*;     // Collections.sort(aa, String.CASE_INSENSITIVE_ORDER);



public class _2quest {
    public static void main(String[] args) {
        ArrayList<String>aa=new ArrayList<>();
    
        aa.add("Bhopal");
        aa.add("Chennai");
        aa.add("Amritsar");
        aa.add("Indore");
        aa.add("Gwalior");

       Collections.sort(aa);

       Iterator<String> iterator=aa.iterator();
          
               while(iterator.hasNext())
               {
                String a=iterator.next();
                System.out.println(a);
                
               }
        
    }
    
}
