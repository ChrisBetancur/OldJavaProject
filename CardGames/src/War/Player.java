package War;

public class Player {
    int indexOfCard;
    int indexOfCollected;
    String name;
    Card[] playerDeck;
    Card[] collected;
    public Player(String name){
        this.name=name;
        playerDeck=new Card[26];
        collected =new Card[26];
        indexOfCard=0;
        indexOfCollected=0;
    }
    public void showPlayerStats(){
        int cardCount=0;
        for(Card card:collected){
            cardCount++;
        }
        cardCount=0;
        System.out.println("Collected: "+cardCount);
        for(Card card:playerDeck){
            cardCount++;
        }
        System.out.println("Player Deck: "+cardCount);
    }
    public void printDeck(){
        if(playerDeck!=null){
            System.out.println(name+": ");
            for(Card curr:playerDeck){
                curr.printCard();
                System.out.println();
            }
        }
    }
    private void resizeArr(Card[] arr){
        Card[] temp=new Card[arr.length*2];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        for(Card curr:arr){
            curr=null;
        }
        arr=null;
        arr=temp;
    }
    public void reshuffle(){
       // if(indexOfCard==playerDeck.length){
            for(Card curr:collected) {
                int randIndex = (int) (Math.random() * collected.length);
                Card temp = curr;
                curr = collected[randIndex];
                collected[randIndex] = temp;
            }
            for(Card card:playerDeck){
                card=null;
            }
            playerDeck=null;
            playerDeck=collected;
            for(Card card:collected){
                card=null;
            }
            collected=null;
       //}
    }
    public Card revealTop(){
        if(indexOfCard>=playerDeck.length){
            reshuffle();
            indexOfCard=0;
        }
        Card top=playerDeck[indexOfCard];
        indexOfCard++;
        return top;
    }
    public void addToCollected(Card card){
        if(collected!=null) {
            if (indexOfCollected == collected.length) {
                resizeArr(collected);
            }
        }
        collected[indexOfCollected]=card;
        indexOfCollected++;
    }
}
