import java.util.List;

public class subsequenceSum {
    static void printSubsequence(int[] arr , int index , List<Integer> List , int currSum , int sum)
    {
        if (index == arr.length) {
            if (currSum == sum) {
                System.out.println(List);
             }
            return;
        }
        //Take
        List.add(arr[index]);
        currSum = currSum + arr[index];

        printSubsequence(arr, index + 1, List , currSum, sum);
        //BackTrack

        currSum = currSum - arr[index];
        List.remove(List.size() - 1);
        //Not Take
        printSubsequence(arr, index+1, List , currSum, sum);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        // Create an empty ArrayList of Integer
        java.util.List<Integer> List = new java.util.ArrayList<>();
        printSubsequence(arr, 0, List , 0 , 3);
    }
}
