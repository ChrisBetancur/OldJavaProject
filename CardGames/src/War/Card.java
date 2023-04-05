package War;

import static War.SpecialCard.*;

public class Card {
    int value;
    FaceValue faceValue;
    SpecialCard specialCard;
    public Card(int value,FaceValue faceValue){
        this.value=value;
        this.faceValue=faceValue;
        if(value==11){
            specialCard=JACK;
        }
        if(value==12){
            specialCard=QUEEN;
        }
        if(value==13){
            specialCard=KING;
        }
        if(value==14){
            specialCard=ACE;
        }
    }
    public void printCard(){
        if(specialCard!=null){
            System.out.print(faceValue+" "+specialCard);
            return;
        }
        System.out.print(faceValue+" "+value);
    }
    public Card compare(Card card){
        if(this.value>card.value){
            return this;
        }
        if(this.value< card.value){
            return card;
        }
        return null;
    }
}
