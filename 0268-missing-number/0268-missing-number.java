class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        // int ts=(n*(n+1))/2;
        // int s=0;
        // for(int n1:nums){
        //     s+=n1;
        // }
        // return ts-s;
        int ans=n;
        for(int i=0;i<n;i++){
             ans ^= i;
            ans ^= nums[i];
        }
        return ans;
    }
}