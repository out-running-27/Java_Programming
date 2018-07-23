public class Deal {
    public static void main(String[] args) {

        int CARDS_PER_PLAYER = 5;
        int PLAYERS = Integer.parseInt(args[0]);
        String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] SUITS = {"H", "C", "D", "S"};
        int n = RANKS.length * SUITS.length;

        //Create Deck
        String[] deck = new String[n];
        for (int x = 0; x < RANKS.length; x++) {
            for (int y = 0; y < SUITS.length; y++) {
                deck[(SUITS.length*x)+y] = RANKS[x] + SUITS[y];
            }
        }

        //Shuffle Deck
        for (int z = 0; z < n; z++) {
            int r = 1 + (int) (Math.random() * (n-1));
            String temp = deck[z];
            deck[z] = deck[r];
            deck[r] = temp;
        }

        // for (int c =0; c < deck.length; c++) {
        //     System.out.print(deck[c] + " ");
        // }
        // System.out.println();
        
        for (int a = 0; a < PLAYERS; a++) {
            String[] hand = new String[5];

            for (int b = 0; b < 5; b++) {
                hand[b] = deck[(a * CARDS_PER_PLAYER) + b];
            }

            for (int c =0; c < hand.length; c++) {
                System.out.print(hand[c] + " ");
            }

            System.out.println();
        }
    }
}