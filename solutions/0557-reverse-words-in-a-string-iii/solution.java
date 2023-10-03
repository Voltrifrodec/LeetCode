class Solution {
    public String reverseWords(String s) {

        // System.out.print("\nOriginal:\t" + s + "\nReversed: ");

        String[] words = s.split(" ");

        String result = "";
        for(String word : words) {
            StringBuilder reverse = new StringBuilder().append(word).reverse();
            result += reverse + " ";
        }

        return result.substring(0,result.length() - 1);

    }
}
