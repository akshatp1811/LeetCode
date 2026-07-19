import java.util.Stack;

class Pair {
    int value;
    int minValue;
    
    Pair(int _value, int _minValue) {
        value = _value;
        minValue = _minValue;
    }
}

class MinStack {
    Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        // If stack is empty, the current val is the minimum
        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            // Otherwise, find the actual minimum between current min and new val
            int currentMin = st.peek().minValue;
            int newMin = Math.min(currentMin, val);
            st.push(new Pair(val, newMin));
        }
    }
    
    public void pop() {
        if (!st.isEmpty()) {
            st.pop(); // Just pop, don't return anything
        }
    }
    
    public int top() {
        return st.peek().value;
    }
    
    public int getMin() {
        return st.peek().minValue;
    }
}