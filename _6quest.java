//Create a HashSet of names. Add 5 names, then convert this HashSet into an ArrayList and print the resulting list.

import java.util.ArrayList;
import java.util.HashSet;

public class _6quest {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();

        names.add("akansha");
        names.add("kashish");
        names.add("Priyanshi");
        names.add("mahima");
        names.add("vaishali");

        ArrayList<String> alist=new ArrayList<>(names);


          for(int i=0;i<alist.size();i++)
          {
            System.err.println(alist.get(i));
          }

          System.out.println(alist.get(2));


    }
    
}
