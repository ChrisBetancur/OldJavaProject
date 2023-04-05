package War;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    int index;
    Card[] deck;
    public Deck(){
        deck=new Card[52];
    }
    public void generateDeck(){
        index=0;
        for(FaceValue curr:FaceValue.values()){
            for(int i=2;i<15;i++){
                deck[index]=new Card(i,curr);
                index++;
            }
        }
    }
    public void randomizeDeck(){
        if(deck!=null){
            for(Card curr:deck){
                int randIndex=(int)(Math.random()*deck.length);
                Card temp=curr;
                curr=deck[randIndex];
                deck[randIndex]=temp;
            }
        }
    }
    public /*ArrayList<Card[]>*/void split(Player player1,Player player2){
        for(int i=0;i<26;i++){
            player1.playerDeck[i]=deck[i];
        }
        int index=0;
       for(int i=26;i<52;i++){
            player2.playerDeck[index]=deck[i];
            index++;
        }
        /*ArrayList<Player> decks=new ArrayList<>();
        decks.add(player1);
        decks.add(player2);

        return decks;*/
    }
    public void print(){
        if(deck!=null){
            for(Card curr:deck){
                curr.printCard();
                System.out.println();
            }
        }
    }
}
