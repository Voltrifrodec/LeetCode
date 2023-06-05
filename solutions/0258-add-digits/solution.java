class Solution {
    public int addDigits(int num) {
        // Based from the Solution section:
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
        
        // My previous solution:
//         char[] arr = Integer.toString(num).toCharArray();
//         if(arr.length == 1)
//             return num;
//         int sum = 0;
//         while(arr.length != 1) {
//             sum = 0;
//             for(char c : arr) {
//                 sum += Character.getNumericValue(c);
//             }
//             arr = Integer.toString(sum).toCharArray();
//             System.out.println(arr.length + " " + sum);
//         }
        
//         return sum;
    }
}
