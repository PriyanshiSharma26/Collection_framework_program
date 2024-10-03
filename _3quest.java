//Create a LinkedList of 4 countries, add one country to the beginning and one at the end, then print the list in reverse orde

import java.util.*;




public class _3quest {
    public static void main(String[] args) 
    {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("india");
        ll.add("japan");
        ll.add("china");
        ll.add("pakistan");
        ll.add("dubai");
        System.out.println(ll);

        ll.addFirst("France");
        ll.addLast("russia");

        Collections.reverse(ll);

        System.out.println(ll);

        Iterator <String> it=ll.iterator();

        while (it.hasNext()) {
            String link=it.next();
            System.out.print(link +" ");
            
        }




    }
}
        