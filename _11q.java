//Write a program to remove duplicates from an ArrayList of integers.


import java.util.*;
class Arrlist{
    public static void main(String[] args) {
        ArrayList <Integer> aal=new ArrayList<>();
        aal.add(3);
        aal.add(4);
        aal.add(6);
        aal.add(4);
        aal.add(7);
        aal.add(3);


        LinkedHashSet <Integer>lhs=new LinkedHashSet<>(aal);

        ArrayList<Integer> arr=new ArrayList<>(lhs);

        System.out.println("list with unique elements :"+arr);

        


    }


}


