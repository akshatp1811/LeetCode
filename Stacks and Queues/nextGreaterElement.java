import java.util.Stack;

public class nextGreaterElement {
    Stack<Integer> stack = new Stack<>();
    int[] nge = new int[stack.size()];
    for(int i = 0;i<n-1;i++)
    {
        while(!stack.empty() && stack.top<=arr[i])
        {
            stack.pop();
        }
        if (stack.empty()) {
            nge[i] == -1;
        }
        else nge[i] = stack.Top();
        stack.push(arr[i])
    }

    }
    
        
    
}
