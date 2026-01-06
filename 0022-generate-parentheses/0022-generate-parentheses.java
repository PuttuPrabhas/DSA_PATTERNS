class Solution {
    public void backTrack(int open, int close, int n , String s , List<String> res){
        if(open+close == 2*n && open == close){
            res.add(s);
            return;
        }
        if(open  < n){
            backTrack(open+1,close,n,s+'(',res);
        }
        if(close < open){
            backTrack(open,close+1,n,s+')',res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(0,0,n,"",res);
        return res;
        
    }
}