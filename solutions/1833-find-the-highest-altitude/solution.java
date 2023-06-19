class Solution {
    public int largestAltitude(int[] gain) {
        int start = gain[0];
        int temp = Math.max(0, start);
        
        for(int i = 1; i < gain.length; i++) {
            start += gain[i];
            temp = Math.max(temp, start);
        }
        
        return temp;
    }
}
