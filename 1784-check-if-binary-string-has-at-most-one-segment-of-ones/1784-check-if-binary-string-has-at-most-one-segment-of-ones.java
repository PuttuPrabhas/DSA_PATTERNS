class Solution {
    public boolean checkOnesSegment(String s) {
       int index0 = -1;
       int index1 = -1;
       for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '1'){
            if(index0!=-1 && index1!= -1 && index0 > index1){
                return false;
            }
        }
        if(s.charAt(i) == '1' && index1==-1){
            index1 = i;
        }
        else if (s.charAt(i) == '0' && index0 == -1){
            index0 = i;
        }       }
        return true;
        
    }
}