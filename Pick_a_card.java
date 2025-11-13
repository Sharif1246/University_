
package pick_a_card;

public class Pick_a_card {

    public static void main(String[] args) {
        // in this program the computer gives user a random card
        
        int rank=(int)(Math.random()*13)+1; // cause we have 13 ranks in pickking a card
        int suit=(int)(Math.random()*4)+1; // we have three suits clubs diamonds hearts and spades
        
        String rankname="";
        String suitname="";
        
        if(rank==1)
            rankname="Ace";
        else if(rank==11)
            rankname="jack";
        else if(rank==12)
            rankname="Queen";
        else if(rank==13)
            rankname="king";
        else
            rankname=rank+""; //for 2-10 just we use number
        
        if(suit==1)
            suitname="Clubs";
        else if(suit==2)
            suitname="Diamonds";
        else if(suit==3)
            suitname="herats";
        else
            suitname="spades";
        
        System.out.println("The card you picked is: "+rankname+" of "+suitname);
        
    }
    
}
