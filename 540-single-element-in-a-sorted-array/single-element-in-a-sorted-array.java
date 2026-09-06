class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            //single element array
            if(s == e){
                return nums[s];
            }
            //multiple element array
            int currentValue = nums[mid];
            int prevValue = -1;
            if(mid-1 >= 0) {
                 prevValue = nums[mid-1];
            }
             int nextValue = -1;
            if(mid+1 < n) {
                 nextValue = nums[mid+1];
            }
            //Valid answer
            if(currentValue != prevValue && currentValue != nextValue){
                return currentValue;
            }
            if(currentValue != prevValue && currentValue == nextValue){
                int startingIndexPair = mid;
                if((startingIndexPair & 1) == 1){
                    //odd case -> move left for ans
                    e = mid - 1;
                }
                else {
                      //even case -> move right for ans
                      s = mid + 1;
                }
            }
            else if(currentValue == prevValue && currentValue != nextValue){
                int endingIndexPair = mid;
                if((endingIndexPair & 1) == 1){
                    //odd case -> move right for ans
                    s = mid + 1;
                }
                else {
                      //even case -> move left for ans
                      e = mid - 1;
                }
            }
        }
        return -1;
    }
}