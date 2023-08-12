class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for(int num: accounts[i]) {
                temp += num;
            }
            result = result < temp ? temp : result;
        }

        // System.out.println(result);
        return result;
    }
}
