//Create an ArrayList of integers. Add 5 numbers, then remove all odd numbers and print the final list.

import java.util.*;;
class  all{
    public static void main(String[] args)
     {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);

        Iterator<Integer>iter=a.iterator();
        while (iter.hasNext()) {
            int no=iter.next();
            if(no%2!=0)
            {
                iter.remove();
            }
         
        }

        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }

 
    
    
}
    }
