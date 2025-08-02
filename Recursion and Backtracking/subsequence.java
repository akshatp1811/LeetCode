import java.util.List;

public class subsequence {
    static void printSubsequence(int[] arr , int index , List<Integer> List)
    {
        if (index == arr.length) {
            System.out.println(List);
            return;
        }
        //Take
        List.add(arr[index]);
        printSubsequence(arr, index + 1, List);
        //BackTrack
        List.remove(List.size() - 1);
        //Not Take
        printSubsequence(arr, index+1, List);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        // Create an empty ArrayList of Integer
        java.util.List<Integer> List = new java.util.ArrayList<>();
        printSubsequence(arr, 0, List);
    }
}
