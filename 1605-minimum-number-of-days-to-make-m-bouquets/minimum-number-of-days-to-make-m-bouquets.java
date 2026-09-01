class Solution {
    static boolean isValidAns(int[] bloomDay, int m, int k, int mid) {
        int noOfBouquet = 0;
        int consecutive = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                consecutive++;
                if (consecutive == k) {
                    noOfBouquet++;
                    consecutive = 0;
                }
            } 
            else {
                consecutive = 0;
            }
            if (noOfBouquet >= m) {
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        // Not enough flowers
        if ((long) m * k > n) {
            return -1;
        }
        int s = 1;
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int e = maxi;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(bloomDay, m, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}