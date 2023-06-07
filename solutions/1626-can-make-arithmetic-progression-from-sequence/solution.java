class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int[] difference = new int[arr.length];
        difference[0] = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++) {
            difference[i - 1] = arr[i] - arr[i - 1];
            System.out.println(difference[i]);
            if(difference[i - 1] != difference[i - 2])
                return false;
        }
        return true;
        
    }
}
