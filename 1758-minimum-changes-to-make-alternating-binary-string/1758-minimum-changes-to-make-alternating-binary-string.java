class Solution {
    public int minOperations(String s) {
        int count = 0;
        int count1 = 0;
        char c = '0';
        char d = '1';
        for(char i : s.toCharArray()){
            if(c!=i){
                count++;
            }
            if(c == '0') c = '1';
            else c = '0';
            if(d!=i){
                count1++;
            }
            if(d == '0' ) d = '1';
            else d = '0';
        }
        return Math.min(count,count1);
       
    }
}