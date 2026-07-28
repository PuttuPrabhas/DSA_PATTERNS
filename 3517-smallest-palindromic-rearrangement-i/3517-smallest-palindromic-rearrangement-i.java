class Solution {
    public String smallestPalindrome(String s) {
        int size = s.length();
        if(size  <= 1) return s;
        int left = 0;
        int right = s.length()-1;
        char[]letters = s.toCharArray();
        int[] arr = new int[26];
        for(char  i : s.toCharArray()){
            arr[i-'a']++;
        }
        for(int i = 0; i < 26; i++){
            int n = arr[i];
            char m = (char)('a'+i);
            if(n%2!=0){
                letters[(size/2)] = m;
                n--;
                
            }
            while(n!=0){
                letters[left++] = m;
                letters[right--] = m;
                n-=2;
            }
            

        }
        return new String(letters);
        
    }
}