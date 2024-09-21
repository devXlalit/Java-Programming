package StackDSA;

public class stackImp {
    private int arr[];
    private int top;
    private int capacity;
    
    
    stackImp(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
        }
        System.out.println("Inserting element in stack: "+x);
    
        arr[++top] = x;
        // top++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }

        return arr[top--];
    }

    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity-1;
    }

    public void printStack(){
        System.out.println("Stack values are: ");
        for(int i: arr){
            System.out.println(i);
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
    public int top(){
        return arr[top];
    }

}
