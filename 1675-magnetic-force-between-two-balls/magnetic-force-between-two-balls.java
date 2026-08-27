class Solution {
    static boolean isValidAns(int[] position, int m,int minPosition){
        int Count = 1;
        int lastposition = 0;
        for(int i=1;i<position.length;i++){
            if(position[i] - position[lastposition] >= minPosition){
                Count++;
                lastposition = i;
                if(Count == m){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int s = 0;
        int e = position[n-1] - position[0];
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValidAns(position,m,mid)){
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;   
    }
}