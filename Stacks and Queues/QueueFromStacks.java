public class QueueFromStacks {
    static int stack[] = new int[5];
    static int tos = -1;

    static void push(int val , int[] stack)
    {
        if(isFull(stack)) {
            System.out.println("Stack OverFLow");
            return;
        }
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

//+++++++++++++++++++++++++++++++Implementing Queue from stacks++++++++++++++++++++++++++++++++++++++++++++++++++++
    static int[] stack1 = new int[5];
    static int[] stack2 = new int[5];

    static void QueuePush(int val){
        push(val, stack1);
        int valu = pop(stack1);
        push(valu,stack2);
    }
    static int QueuePop(){
        return pop(stack2);
    }



    public static void main(String[] args) {
        // pushQueue(5 , stack);
        // printStack(stack);
        // push(4 , stack);
        // printStack(stack);
        // push(3 , stack);
        // printStack(stack);
        // push(2 , stack);
        // printStack(stack);
        // push(1 , stack);
        // printStack(stack);
        // System.out.println(pop(stack));
        // printStack(stack);
        // System.out.println(pop(stack));
        // printStack(stack);
        // System.out.println(pop(stack));
        // printStack(stack);
        // System.out.println(pop(stack));
        // printStack(stack);
        // System.out.println(pop(stack));
        // printStack(stack);

        QueuePush(5);
        printStack(stack);
        QueuePush(4);
        printStack(stack);
        QueuePush(3);
        printStack(stack);
        QueuePush(2);
        printStack(stack);
        QueuePush(1);
        printStack(stack);
        System.out.println(QueuePop());
        printStack(stack);
        System.out.println(QueuePop());
        printStack(stack);
        System.out.println(QueuePop());
        printStack(stack);
        System.out.println(QueuePop());
        printStack(stack);
        System.out.println(QueuePop());
        printStack(stack);
        


        
    }
}