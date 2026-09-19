class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;
        while(i >= 0){
            //remove all trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            //check value of i
            if(i < 0){
                break;
            }
            int j = i;
            //find start index of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            //At the space index j will stop
            //and append the substring
            ans.append(s.substring(j+1,i+1));
            //remove extra spaces where j is standing
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            //Add apaces except the first string
            if(j >= 0){
                ans.append(' ');
            }
            //place i at last index of remaining string
            i = j;
        }
        return ans.toString();
    }
}