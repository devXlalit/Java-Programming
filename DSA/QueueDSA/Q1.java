package QueueDSA;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {

        Queue<String> pq = new PriorityQueue<>();

        
        pq.add("some");
        pq.add("string");
        pq.add("test");
        pq.add("so");

        System.out.println(pq);
        

        pq.remove();
        System.out.println(pq);
        System.out.println(pq.peek());

    
        

        
        
        // pq.add("first");
        // pq.add("car");
        // pq.add("bucket");
        // System.out.println(pq);
        // System.out.println(pq.peek());
        // System.out.println(pq.isEmpty());
        // System.out.println(pq.size());

            
    
    }
}


// LILO
// FIFO