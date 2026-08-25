class Solution { 
    static boolean isValidAnswer(int[] weights,int k,int maxm){
        int Count = 1;
        int capacity = 0;
        for(int i=0;i<weights.length;i++){
            if(capacity + weights[i] <= maxm){
                capacity = capacity + weights[i];
            }
            else {
                Count++;
                if(Count > k || weights[i] > maxm){
                    return false;
                }
                else {
                    capacity = 0;
                    capacity = capacity + weights[i];
                }
            }
        }
        return true;
    }
     public int shipWithinDays(int[] weights, int k) {
        if(weights.length < k){
            return -1;
        }
        int n = weights.length;
        int s = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        int e = sum;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValidAnswer(weights,k,mid)){
                ans = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return ans;
    }
}