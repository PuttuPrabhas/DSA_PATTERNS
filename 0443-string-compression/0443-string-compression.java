class Solution {
    public int compress(char[] chars) {
        if(chars.length <= 1){
            return chars.length;
        }
        int left = 0;
        int right = 0;
        int index = 0;
        while(right < chars.length){
            if(chars[left] == chars[right]){
                right++;
            }
            else{
                chars[index++] = chars[left];
                int diff = right-left;
                if(diff > 1){
                    String s = Integer.toString(diff);
                    for(char i : s.toCharArray()){
                        chars[index++] = i;
                    }
                }
                left = right;
                
            }
        }
        
        int diff = right - left;
        chars[index++] = chars[left];
        if(diff > 1){
            String s = Integer.toString(diff);
            for(char i : s.toCharArray()){
                chars[index++] = i;
            }

        }
        return index;
        
    }
}