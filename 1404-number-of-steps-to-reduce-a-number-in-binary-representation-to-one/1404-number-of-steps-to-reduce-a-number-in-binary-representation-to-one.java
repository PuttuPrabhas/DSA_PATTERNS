class Solution {
    public String addOne(String binary) {
    StringBuilder sb = new StringBuilder(binary);
    int carry = 1;

    for (int i = sb.length() - 1; i >= 0; i--) {
        if (sb.charAt(i) == '1' && carry == 1) {
            sb.setCharAt(i, '0');
        } else if (sb.charAt(i) == '0' && carry == 1) {
            sb.setCharAt(i, '1');
            carry = 0;
            break;
        }
    }

    if (carry == 1) {
        sb.insert(0, '1');
    }

    return sb.toString();
}
    public int numSteps(String s) {
        int count = 0;
        while(s.length()>1){
            count++;
            if(s.charAt(s.length()-1) == '1'){
                s = addOne(s);
            }
            else{
                s = s.substring(0,s.length()-1);
            }
        } 
        return count;    
        
    }
}