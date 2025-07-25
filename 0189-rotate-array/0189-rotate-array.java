class Solution {
    public void rotate(int[] nums, int k) {
        // int n=nums.length;
        // if(k>n) k=k%n;
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[(i+k)%n]=nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=arr[i];
        // }
        int n=nums.length;
        if(k>n) k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    static void reverse(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            s++;
            e--;
        }
    }
}