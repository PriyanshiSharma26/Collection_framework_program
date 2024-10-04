//create a HashSet of 5 numbers. Check if a specific number exists and print whether it’s found or not.

import java.util.HashSet;

public class _5quest {
    public static void main(String[] args) 
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(3);
        hs.add(5);
        hs.add(7);
        hs.add(9);

        int no=3;

        if(hs.contains(no))
        {
            System.out.println(no +"is present in list");
        }

        else{
            System.out.println(no +"is not present in the list");
        }




        
    }
    
}
