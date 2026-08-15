class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;

        while(s < e) {

            int mid = s + (e-s)/2;
            
            if(nums[mid] > nums[n-1]){
                s = mid + 1;
            }
            else {
                e = mid;
            }
        }
        return nums[s];
    }
}