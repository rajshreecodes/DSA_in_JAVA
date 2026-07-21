class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int sum = 0;
        while(x>0){
            int remainder = x % 10;
            x = x / 10;
            sum = (sum * 10) + remainder;

        }
        if(original == sum){
        return true;
        }
        else {
            return false;
        }
    }
}