class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int l=0, r=0, sum=0, n = nums.length, len = Integer.MAX_VALUE;
       while(r < n){
        sum += nums[r];
        while(sum >= target){
            len = Math.min(len, r-l+1);
            sum -= nums[l];
            l++;
        }
        r++;
       }
       if(len == Integer.MAX_VALUE) return 0;
       return len;
    }
}