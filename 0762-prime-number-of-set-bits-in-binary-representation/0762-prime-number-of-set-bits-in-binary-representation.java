class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        for(int i = left; i <= right; i++){
            int count = Integer.bitCount(i);
            if(set.contains(count)){
                res++;
            }
        }
        return res;
    }
}