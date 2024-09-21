package LinkedList;

public class LLImp {
    Node head;

    static class Node{
        int value;
        Node next;

        Node(int d){
        value = d;
        next = null;
    }
    }

    

    public static void main(String[] args) {
        LLImp list = new LLImp();

        list.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        // connecting nodes 

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Printing linkedList: ");


        while (list.head != null) {
            System.out.println(list.head.value);
            
            
            list.head = list.head.next;
            
        }

        
    }
    
}
