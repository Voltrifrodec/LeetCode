class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;
        for(String sentence: sentences) {
            int temp = 1;
            for(int i = 0; i < sentence.length(); i++) {
                temp = sentence.charAt(i) == ' ' ? temp + 1 : temp;
            }
            if(temp > max)
                max = temp;
        }

        return max;

    }
}
