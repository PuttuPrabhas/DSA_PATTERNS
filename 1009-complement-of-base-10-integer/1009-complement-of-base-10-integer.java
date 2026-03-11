class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toBinaryString(n);
        
        for(char i : s.toCharArray()){
            if(i == '0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        
        int ans = Integer.parseInt(sb.toString(),2);
        return ans;

        
    }
}