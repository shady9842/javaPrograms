import java.util.Stack;

public class _05StackExample {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();

        //push
        for (int i = 1; i < 11; i++) {
            st.push(i);
        }
        System.out.println("After insertion in stack");
        System.out.println(st);

        //pop
        st.pop();
        st.pop();
        System.out.println("After deletion from stack");
        System.out.println(st);

        //empty,peek and search
        if(st.empty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
            System.out.println("Peek item: "+st.peek());
            System.out.println("Item at position 5: "+st.search(5));
        }
    }
    
}
