package LinkedList;

import java.util.LinkedList;

public class L1 {
    public static void main(String[] args) {
        

        LinkedList<Integer> mylist = new LinkedList<>();

        mylist.add(12);
        mylist.add(17);
        mylist.add(13);
        mylist.add(20);
        mylist.add(45);


        
        mylist.add(3, 55);
        // mylist.addFirst(78);
        // mylist.addLast(78);

        System.out.println(mylist);
       

    }
}
