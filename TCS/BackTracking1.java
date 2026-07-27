import java.util.*;

class BackTracking1 {
    static int count = 0;

    static void solve(int index,int n,int[] values,int end,int previous)
    {
        //Base Case
        if(index == n - 1){
            if(previous != end){
                count++;
        }
    return;
    }
    for(int i = 0; i < values.length;i++){
        int current = values[i];
        if(current != previous){
            solve(index + 1, n ,values,end,current);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int r = sc.nextInt();

        int[] values = new int[r];

        for (int i = 0; i < r; i++) {
            values[i] = sc.nextInt();
        }

        int end = sc.nextInt();

        solve(1, n, values, end, 1);

        System.out.println(count);
    }
}