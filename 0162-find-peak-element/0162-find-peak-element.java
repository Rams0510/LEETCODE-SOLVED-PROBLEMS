class Solution {
    public int findPeakElement(int[] nums) {
        // int n=nums.length;
        // if(n==1) return 0;
        // for(int i=0;i<n;i++){
        //     if((i==0 || nums[i-1]<nums[i]) && (i==n-1 || nums[i]>nums[i+1])){
        //         return i;
        //     }
        // }
        // return -1;
        int low = 0, high = nums.length - 1;
        while (low <high) {
            int mid = low + (high - low) / 2;
            if (nums[mid]>nums[mid+1]) { 
                high = mid;     
            }
            else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}