import java.util.ArrayList;

/**
 * Set class: contains a list with all cards of a set
 * */

public class Set {

    private String name;                                    // name of the set

    private ArrayList<Card> cardList = new ArrayList<Card>();     // list of all cards in that set

    /**
     * Getter and Setter
     * */

    // only wrote a getter cuz setting it from outside is not needed

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public void addToCardList(Card card){
        cardList.add(card);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Print list method
     * outputs the ArrayList cardList onto the console
     * */

    public void printCardList(){

        System.out.println("** Cardlist **");
        System.out.println("Set:        "+getName()+"\n");

        for(int i = 0; i < cardList.size(); i++ ){
            System.out.println("ID:         "+cardList.get(i).getID());
            System.out.println("Name:       "+cardList.get(i).getName());
            System.out.println("Creator:    "+cardList.get(i).getCreator());

            System.out.println("");
        }

    }


}
