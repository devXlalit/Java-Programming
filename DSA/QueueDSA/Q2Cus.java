package QueueDSA;

public class Q2Cus {
    public static void main(String[] args) {
        Q2 ob = new Q2();
        ob.enq(10);
        ob.enq(30);
        ob.enq(20);
        ob.display();
        System.out.println(ob.deq());
        System.out.println(ob.isEmpty());
        System.out.println(ob.isFull());

    }
}
