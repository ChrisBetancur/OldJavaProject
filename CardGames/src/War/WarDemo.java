package War;

import java.util.ArrayList;
public class WarDemo {
    public static void main(String[] args){
       /* Deck deck=new Deck();
        deck.generateDeck();
        //ArrayList<Card[]> playersDeck=deck.split();
        deck.randomizeDeck();
        Player player1=new Player("Chris");
        Player player2=new Player("Sebas");
        deck.split(player1,player2);
       /// player1.playerDeck=playersDeck.get(0);
        player1.revealTop().printCard();
        //player2.printDeck();
       //player2.playerDeck=playersDeck.get(1);
        //deck.print();*/

        WarGame startGame=new WarGame("Chris","Sebas");
        startGame.start();

    }
}
