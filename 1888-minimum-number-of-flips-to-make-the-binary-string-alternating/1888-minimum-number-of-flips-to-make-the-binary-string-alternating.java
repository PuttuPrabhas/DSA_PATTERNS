class Solution {
    public int minFlips(String s) {
        int a = 0;
        int b = 0; 
        int c = 0; 
        int d = 0;

        int flips = Integer.MAX_VALUE;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (i % 2 == 0) a++;
                else b++;
            } else {
                if (i % 2 == 0) c++;
                else d++;
            }
        }

        if (s.length() % 2 == 0) {
            return Math.min(a + d, b + c);
        }

        for (int i=0; i<s.length(); i++) {
            flips = Math.min(flips, Math.min(a + d, b + c));

            int temp;

            temp = a;
            a = b;
            b = temp;

            temp = c;
            c = d;
            d = temp;

            if (s.charAt(i) == '1') {
                c--;
                a++;
            } else {
                c++;
                a--;
            }
        }

        return flips;
        
    }
}