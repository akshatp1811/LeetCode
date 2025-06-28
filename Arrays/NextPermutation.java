class NextPermutation {
    public void nextPermutation(int[] nums) {
         int ind = -1;
        int n = nums.length;
        for (int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1])
            {
                ind = i;
                break;
            }
            
        }
        if (ind == -1) {
            reverse(nums , 0 , n-1); 
            return;
        }
        
        for(int i = n-1 ; i >= ind ; i--){
            if(nums[i] > nums[ind]){
            swap (nums , i , ind);
            break;
            }
        }
        reverse(nums , ind+1 , n-1) ;
        }
    public static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
public static void main(String[] args) {
    int[] nums = {2 ,1 ,5 ,4, 3, 0 ,0};
    NextPermutation np = new NextPermutation();
    np.nextPermutation(nums);
    for (int num : nums) {
        System.out.print(num + " ");
    }
    System.out.println();
}
}