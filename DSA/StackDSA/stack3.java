package StackDSA;

public class stack3 {
    public static void main(String[] args) {
        stackImp st = new stackImp(5);
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(1);
        System.out.println(st.top());
        System.out.println(st.pop());
        st.printStack();
       
    }
}
