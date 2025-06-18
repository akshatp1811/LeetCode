public class MinStack {
    
    public int[][] stack;
    int tos = -1;

    public MinStack() {
        stack = new int[5][2];
    }
    
    void push(int val)
    {
        int min =-1;
        if(isFull()) {
            System.out.println("Stack OverFLow");
            return;
        }
        if(isEmpty()){
            min = val;
            tos++;
        }
        else if(min > val){
            min = val;
            stack[tos][0] = val;
            stack[tos][1] = min;
            tos++;
        }
        else
        {
            stack[tos][0] = val;
            stack[tos][1] = min;
            tos++;
        }
    }
    int getMin(){
        return stack[tos][1];

    }

    int pop()
    {
        if(isEmpty()) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int value =stack[tos][0];
        tos--;
        return value;
        
    }
    int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[tos][0];
    }

    boolean isFull()
    {
        if (tos == stack.length - 1) {
            return true;
        }
        else return false;
    }
    boolean isEmpty()
    {
        if (tos == -1) {
            return true;
        }
        else return false;
    }
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= tos; i++) {
            System.out.print(stack[i][0] + " ");
        }
        System.out.println();
    }


//Key Learning 
/*
 * If you want to make a variable used in function without calling it you 
 * have to not make it static but then you wont be able to call it in the main function
 * for that you have to use an object to call the function 
 */


    public static void main(String[] args) {
        MinStack stack = new MinStack(5, 2);  // create a MinStack with size 5

        // Push elements
        stack.push(10);
        stack.push(5);
        stack.push(15);
        stack.push(3);
        stack.push(8);

        // Print stack
        stack.printStack();

        // Print top element
        System.out.println("Top: " + stack.top());

        // Get minimum
        System.out.println("Min: " + stack.getMin());

        // Pop an element
        System.out.println("Popped: " + stack.pop());

        // Print after pop
        stack.printStack();

        // New minimum
        System.out.println("Min after pop: " + stack.getMin());
    }
}



//My Solution
/*
 * class MinStack {

    int[][] stack;
    int tos = -1;

    public MinStack() {
        stack = new int[5][2];
    }
    
    void push(int val)
    {
        int min =-1;
        if(isFull()) {
            System.out.println("Stack OverFLow");
            return;
        }
        if(isEmpty()){
            min = val;
            tos++;
        }
        else if(min > val){
            min = val;
            stack[tos][0] = val;
            stack[tos][1] = min;
            tos++;
        }
        else
        {
            stack[tos][0] = val;
            stack[tos][1] = min;
            tos++;
        }
    }   
    int pop()
    {
        if(isEmpty()) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int value =stack[tos][0];
        tos--;
        return value;
        
    }
    
    int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[tos][0];
    }
     boolean isFull()
    {
        if (tos == stack.length - 1) {
            return true;
        }
        else return false;
    }
    boolean isEmpty()
    {
        if (tos == -1) {
            return true;
        }
        else return false;
    }
    
    int getMin(){
        return stack[tos][1];

    }
} 
 */