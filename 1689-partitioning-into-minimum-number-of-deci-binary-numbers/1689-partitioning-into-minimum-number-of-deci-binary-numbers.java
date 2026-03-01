class Solution {
    public int minPartitions(String n) {
        int maxi = 0;
        for(int i = 0; i < n.length(); i++){
            int dig = n.charAt(i)-'0';
            maxi = Math.max(maxi,dig);
            if(maxi == 9){
                return 9;
            }
        }
        return maxi;
        
    }
}