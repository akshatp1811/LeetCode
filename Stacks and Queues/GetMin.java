public class GetMin {
    
    int[][] stack;
    int size = 5;
    static int tos = -1;

    public GetMin(int size, int cols) {
        stack = new int[size][2];
    }
    
   static void push(int val , int[] stack)
    {
        if(isFull(stack)) {
            System.out.println("Stack OverFLow");
            return;
        }
        if(isEmpty(stack)){
            stack[0][0] = val;
            stack[0][1] = val;
        }
        else
        tos++;
        stack[tos] = val;
    }

    static int pop(int[] stack)
    {
        if(isEmpty(stack)) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int value =stack[tos];
        tos--;
        return value;
        
    }
    static int peek(int[] stack) {
        if (isEmpty(stack)) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[tos];
    }

    static boolean isFull(int[] stack)
    {
        if (tos == stack.length - 1) {
            return true;
        }
        else return false;
    }
    static boolean isEmpty(int[] stack)
    {
        if (tos == -1) {
            return true;
        }
        else return false;
    }
    static void printStack(int[] stack) {
        if (isEmpty(stack)) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= tos; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}