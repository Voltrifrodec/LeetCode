class Solution {
    public boolean winnerOfGame(String colors) {
        
        int player1 = 0;
        int player2 = 0;
        
        for(int i = 1; i < colors.length() - 1; i++) {
            
            // Check the moves. If the previous, current, and next character are the same, 
            // then one of the players can make a move.
            if(colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                // Add score depending on the character.
                if(colors.charAt(i) == 'A')
                    player1++;
                else
                    player2++;
            }
            
        }
        
        // Check if Alice has at least more than one more move than Bob. If she does, she wins.
        return player1 - player2 >= 1;
        
    }
    
}
