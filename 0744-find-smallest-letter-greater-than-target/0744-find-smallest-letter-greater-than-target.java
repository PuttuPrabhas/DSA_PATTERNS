class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = ' ';
        int left = 0;
        int right = letters.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(letters[mid]>target){
                ans = letters[mid];
                right = mid -1;
            }
            else {
                left = mid + 1;
            }
        }
        if(ans == ' '){
            return letters[0];
        }
        return ans;
        
    }
}