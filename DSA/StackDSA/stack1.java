package StackDSA;
import java.util.Stack;
public class stack1 {
    public static void main(String[] args) {



        Stack<Integer> st = new Stack<>();






    st.push(5);
    st.push(4);
    st.push(2);

    System.out.println(st);
    st.pop();
    System.out.println(st);
    System.out.println(st.peek());
    System.out.println(st);

    System.out.println(st.empty());
    // System.out.println(st.search(4));

        // FILO - first in last out 
        // LIFO - last in first out
    }


}



// Stack<Character> stack = new Stack<>();