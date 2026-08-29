class Solution {
    static boolean isValidAns(int[] piles, int h, int speed) {
        int totalHours = 0;
        for (int i = 0; i < piles.length; i++) {
            // Calculate ceil(piles[i] / speed)
            totalHours += piles[i] / speed;
            if (piles[i] % speed != 0) {
                totalHours++;
            }
            // No need to continue if already exceeding h
            if (totalHours > h) {
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int maxi = -1;
        int ans = -1;
        // Find maximum pile
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > maxi) {
                maxi = piles[i];
            }
        }
        int e = maxi;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(piles, h, mid)) {
                // mid is a valid speed
                ans = mid;
                // We need MINIMUM speed
                e = mid - 1;
            }
            else {
                // Speed is too slow
                s = mid + 1;
            }
        }
        return ans;
    }
}