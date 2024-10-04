//Create a HashMap to store 4 students' names as keys and their marks as values. Calculate the average marks and print it.

import java.util.HashMap;


public class _8quest
 {
    public static void main(String[] args) 
    {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("rahul", 70);
        hm.put("ansh", 55);
        hm.put("harsh",80);
        hm.put("abhi", 90);
        
            int sum=0;


         /*    for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            sum += entry.getValue();
                       }*/


                       for (int marks:hm.values()) {
                             sum+=marks;
                       }

                        
                       




        // Calculating the average
        double average = (double) sum / hm.size();

        // Printing the average marks
        System.out.println("The average marks of the students are: " + average);
    }
}

        
        

        

        
        
    
    

