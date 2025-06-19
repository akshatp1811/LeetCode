import java.util.*;
public class RotateByK {
    public static void rotate(int[] nums , int k)
    {
        int n = nums.length;
         k = k % n; // handle if k > n

        // Reverse entire array
        reverse(nums, 0, n - 1);

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse the rest
        reverse(nums, k, n - 1);

    }
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        rotate(nums , 2);
        for (int i = 0; i < nums.length; i++) {
            
                System.out.print(nums[i] + ",");
        }

    }
    
}














// import java.util.*;
// public class RotateByK {
//     public static void rotate(int[] nums , int k)
//     {
//         reverse(nums, 0, k);
//         reverse(nums, k+1 , (nums.length-1));
//         reverse(nums, 0, (nums.length-1));

//     }
//     public static void reverse(int[] nums, int i, int j) {
//         while (i < j) {
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++;
//             j--;
//         }
//     }
//     public static void main(String[] args) {
//         int[] nums = {-1,-100,3,99};
//         rotate(nums , 2);
//         for (int i = 0; i < nums.length; i++) {
            
//                 System.out.print(nums[i] + ",");
//         }

//     }
    
// }