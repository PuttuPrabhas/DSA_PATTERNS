class Solution {
    // public boolean generate(String s, String sb, int k){
    //     if(sb.length() == k){
            
    //         if(s.indexOf(sb)==-1){
    //             return false;
    //         }
    //         return true;
    //     }
    //     return generate(s,sb+'0',k)&& generate(s,sb+'1',k);
    // }
    public boolean hasAllCodes(String s, int k) {
      
        if(s.length() < k ) return false;
        Set<String> set = new HashSet<>();
        for(int i = 0; i <= s.length()-k; i++){
            set.add(s.substring(i,i+k));
        }
        return set.size() == (1<<k);
    
        
    }
}