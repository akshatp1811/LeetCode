public class QueueFromStacks {
    static int stack[] = new int[5];
    static int tos = -1;

    static void push(int val , int[] stack)
    {
        if(isFull(stack)) {
            System.out.println("Stack OverFLow");
            return;
        }
        if (stack == stack1) tos1++;
        else if (stack == stack2) tos2++;
        stack[getTos(stack)] = val;
    }

    static int pop(int[] stack)
    {
        if(isEmpty(stack)) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int value = stack[getTos(stack)];
        if (stack == stack1) tos1--;
        else if (stack == stack2) tos2--;
        return value;
    }

    static int peek(int[] stack) {
        if (isEmpty(stack)) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[getTos(stack)];
    }

    static boolean isFull(int[] stack)
    {
        if (stack == stack1) return tos1 == stack.length - 1;
        else if (stack == stack2) return tos2 == stack.length - 1;
        return false;
    }

    static boolean isEmpty(int[] stack)
    {
        if (stack == stack1) return tos1 == -1;
        else if (stack == stack2) return tos2 == -1;
        return true;
    }

    static void printStack(int[] stack) {
        if (isEmpty(stack)) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= getTos(stack); i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // +++++++++++++++++++++++++++++++ Implementing Queue from stacks ++++++++++++++++++++++++++++++++++++++++++++++++++++
    static int[] stack1 = new int[5];
    static int[] stack2 = new int[5];
    static int tos1 = -1;
    static int tos2 = -1;

    static void QueuePush(int val){
        push(val, stack1);
    }

    static int QueuePop(){
         if (isEmpty(stack1)) {
        System.out.println("Queue is empty");
        return -1;
    }
        while (!isEmpty(stack1)) {
            push(pop(stack1), stack2);
        }
        int valu = pop(stack2);
        while (!isEmpty(stack2)) {
            push(pop(stack2), stack1);
        }
        return valu; 
    }

    static int getTos(int[] stack) {
        if (stack == stack1) return tos1;
        else if (stack == stack2) return tos2;
        return tos; // fallback (used for original stack[])
    }

    public static void main(String[] args) {
        QueuePush(5);
        printStack(stack1);
        QueuePush(4);
        printStack(stack1);
        QueuePush(3);
        printStack(stack1);
        QueuePush(2);
        printStack(stack1);
        QueuePush(1);
        printStack(stack1);
        System.out.println(QueuePop());
        printStack(stack1);
        System.out.println(QueuePop());
        printStack(stack1);
        System.out.println(QueuePop());
        printStack(stack1);
        System.out.println(QueuePop());
        printStack(stack1);
        System.out.println(QueuePop());
        printStack(stack1);
    }
}


/* 
Leetcode Solutions
class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        stack1.push(x); 
    }
    
     public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int val = stack2.pop(); // front of queue

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop()); // restore
        }

        return val;
    }
    
    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
         int val = stack2.peek(); 

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop()); 
        }

        return val;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
*/