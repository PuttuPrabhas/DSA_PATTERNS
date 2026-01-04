class Solution {
    public int[]factors(int n){
        int count = 0;
        int[] ans = new int[2];
        int k = 0;
        boolean flag = true;
        for(int i = 2; i < n; i++){
            if(n%i ==0){
                count++;
                if(count > 2){
                    flag = false;
                    break;
                }
                ans[k++]=i;
            }

        }
        if(!flag || ans[1] == 0){
            return new int[]{};
        }
        return ans;
    }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;

        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i : nums){
            if(!isPrime(i)){
                int[] ans = factors(i);
                System.out.println(Arrays.toString(ans));
                if(ans.length==2){
                    sum+=ans[0]+ans[1]+1+i;
                }
            }
        }
        return sum;
        
    }
}