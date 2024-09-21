package QueueDSA;

public class Q2 {
    int size = 5;
    int arr[] = new int[size];
    int front;
    int rear;


    Q2(){
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        if(rear == size-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }

    void enq(int elem){
        if(isFull()){
            System.out.println("Queue is full");
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = elem;
        System.out.println("Element inserted: "+elem);
    }

    int deq(){
        int element;

        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        element = arr[front];
        if(front >= rear){
            front = -1;
            rear = -1;
        }
        front++;
        System.out.println("Deleting element: "+element);
        return element;
    }

    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        // System.out.println(front);
        for(i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
        // System.out.println(rear);
    }
}
