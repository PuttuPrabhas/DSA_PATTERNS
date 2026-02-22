class Solution {
    public int binaryGap(int n) {    
        String s = Integer.toBinaryString(n);
        int left = -1;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1' && left == -1){
                left = i;
                continue;
            }
            if(s.charAt(i) == '1'){
                maxi = Math.max(maxi, i-left);
                left = i;

            }
        }
        if(maxi == Integer.MIN_VALUE){
            return 0;
        }
        return maxi;
    }
}