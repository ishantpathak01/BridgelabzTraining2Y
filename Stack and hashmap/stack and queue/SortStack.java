import java.util.*;

class SortStack{

    static void sortedInsert(Stack<Integer> st, int x) {

        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int temp = st.pop();

        sortedInsert(st, x);

        st.push(temp);
    }

    static void sortStack(Stack<Integer> st) {

        if (st.isEmpty()) {
            return;
        }

        int x = st.pop();

        sortStack(st);

        sortedInsert(st, x);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(30);
        st.push(10);
        st.push(50);
        st.push(20);

        sortStack(st);

        System.out.println(st);
    }
}
