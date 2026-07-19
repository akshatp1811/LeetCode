import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // Loop through a virtual array of size 2 * n backwards
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Use modulo to get the actual index in the bounds of the array
            int currentIdx = i % n;
            
            // Pop elements from the stack that are smaller than or equal to the current element
            while (!st.isEmpty() && st.peek() <= nums[currentIdx]) {
                st.pop();
            }
            
            // We only record answers during the second pass (the real array range)
            if (i < n) {
                if (st.isEmpty()) {
                    ans[currentIdx] = -1;
                } else {
                    ans[currentIdx] = st.peek();
                }
            }
            
            // Push the current element onto the stack
            st.push(nums[currentIdx]);
        }
        
        return ans;
    }
}


// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         Stack<Integer> = new Stack<>();
//         int[] nge = new int[n];
//         for(int i = 2n-1; i> 0; i--){
//             while(!st.isEmpty() && nums[i%n]>st.peek()){
//                 st.pop();
//             }
//             //Section when we enter the array
//             if
//             st.push(nums[i]);
//         }
        
//     }
// }