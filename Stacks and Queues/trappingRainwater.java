import java.util.*;
import java.lang.Math;

class trappingRainwater {
    public static void trap(int[] height) {
        int n = height.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        // Initialize first and last elements
        prefixMax[0] = height[0];
        suffixMax[n - 1] = height[n - 1];

        // Fill prefixMax from left to right
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        // Fill suffixMax from right to left
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }
        int total = 0;
        for (int i = 0; i < n-1 ; i++) {
            if(height[i] < prefixMax[i] && height[i]<suffixMax[i] )
            {
                total += ((int)(Math.min(prefixMax[i],suffixMax[i])) - height[i]);

            }
        }

        // Print for verification
        System.out.println("Prefix Max:");
        for (int i : prefixMax) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Suffix Max:");
        for (int i : suffixMax) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(total);

    }

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        trap(height);
    }
}






// import java.util.*;
// class trappingRainwater {
//     public static void trap(int[] height) {
//         int[] prefixMax = new int[height.length];
//         int[] suffixMax = new int[height.length];
//         int n = height.length;
//         for(int i = 1; i< n; i++)
//         {
//             prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
//         }
//         for(int i = n-2 ;i > 0 ; i++)
//         {
//             suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
//         }
//         for (int i : suffixMax) {
//             System.out.println(suffixMax[i]);
//         }
//         for (int i : prefixMax) {
//             System.out.println(prefixMax[i]);
//         }


//     }
//     public static void main(String[] args) {
//         int[] height = {0,1,0,2,1,0,1,3,2,1,2,1 };
//         trap(height);
//     }
// }