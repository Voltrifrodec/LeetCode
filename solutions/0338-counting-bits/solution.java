class Solution {
    public int[] countBits(int n) {

        int[] bitsArray = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            byte onesCounter = 0;
            int temp = i;
            while(temp > 0) {
                onesCounter += (temp % 2 == 0) ? 0 : 1;
                temp = temp / 2;
            }
            bitsArray[i] = onesCounter;
            onesCounter = 0;
        }
        
        return bitsArray;
    }
}
