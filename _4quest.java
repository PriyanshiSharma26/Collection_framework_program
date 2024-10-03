//create a linkedlist of 5 integers calculate and print the sum of  all yhe elements

import java.util.LinkedList;

class _4quest {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(2);
        li.add(4);
        li.add(4);
        li.add(8);
        li.add(10);

        int sum = 0;

        for (int lii : li) {
            sum = sum + lii;
        }

        System.out.println("sum of all the elements " + sum);

    }

}
