package War;

public class WarGame {
    Deck deck;
    Player player1;
    Player player2;

    public WarGame(String name1,String name2){
        deck=new Deck();
        player1=new Player(name1);
        player2=new Player(name2);
        deck.split(player1,player2);
    }
    private void checkWinner(Player player1,Player player2){
        System.out.println("It is a tie, there must be tie breaker");
        Card[] pot=new Card[6];
        for(int i=0;i<pot.length;i++) {
            if (i > 2) {
                Card temp = player1.revealTop();
                pot[i] = temp;
            }
            if (i <= 2) {
                Card temp = player2.revealTop();
                pot[i] = temp;
            }
        }
        Card player1Top= player1.revealTop();
        Card player2Top=player2.revealTop();
        Card winner=player1Top.compare(player2Top);
        if(player1Top.equals(winner)){
            /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            System.out.println(player1.name+" won that round");
            System.out.println(player1.name+" won---------");
            for(Card card:pot){
                /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                card.printCard();
            }
            player1.addToCollected(player1Top);
            player1.addToCollected(player2Top);
            for(Card card:pot){
                player1.addToCollected(card);
            }
        }
        else if(player2Top.equals(winner)){
            /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            System.out.println(player1.name+" won that round");
            player1.addToCollected(player1Top);
            player1.addToCollected(player2Top);
            for(Card card:pot){
                player2.addToCollected(card);
            }
        }
        else if(winner==null) {
            checkWinner(player1, player2);
        }
    }
    public void start(){
        deck.generateDeck();
        deck.randomizeDeck();
        deck.split(player1,player2);

        Boolean endGame=false;
        int loopCounter=0;

        while(!endGame){
            System.out.println("Game starting..");
            /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            Card player1Top=player1.revealTop();
            Card player2Top=player2.revealTop();
            Card winner=player1Top.compare(player2Top);
            player1Top.printCard();
            System.out.println(" vs ");
            player2Top.printCard();
            System.out.println();
             if(player1Top.equals(winner)){
               /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println(player1.name+" won that round");
                player1.addToCollected(player1Top);
                player1.addToCollected(player2Top);
            }
            else if(player2Top.equals(winner)){
                /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println(player2.name+" won that round");
                player2.addToCollected(player1Top);
                player2.addToCollected(player2Top);
            }
            else if(winner==null){
                checkWinner(player1,player2);
            }
            //System.out.println(loopCounter);
        }

    }
}
