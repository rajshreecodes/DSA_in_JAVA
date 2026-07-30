class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = (start + end)/2;
        while(start <= end){
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
              mid = (start + end)/2;
        }
         return -1;
    }
}