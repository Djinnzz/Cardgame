import java.util.ArrayList;

/**
 * Set class: contains a list with all cards of a set
 * */

public abstract class Set {

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
        System.out.println("Set:            "+getName()+"\n");

        for(int i = 0; i < cardList.size(); i++ ){

            if(cardList.get(i) instanceof Card_Creature){

                System.out.println("ID:             "+cardList.get(i).getID());
                System.out.println("Name:           "+cardList.get(i).getName());
                System.out.println("Creator:        "+cardList.get(i).getCreator());

                System.out.println("Attack:         "+((Card_Creature) cardList.get(i)).getAttack());
                System.out.println("Defense:        "+((Card_Creature) cardList.get(i)).getDefense());

                System.out.println("Element:        "+((Card_Creature) cardList.get(i)).getElement());
                System.out.println("Race:           "+((Card_Creature) cardList.get(i)).getRace());
                System.out.println("Creatureclass:  "+((Card_Creature) cardList.get(i)).getCreatureClass());

                System.out.println("Type:           "+((Card_Creature) cardList.get(i)).getType());
                System.out.println("Effect:         "+( cardList.get(i)).getEffectText());

                // printing card tags
                if(cardList.get(i).getTagList().size() != 0){
                    System.out.print("Tags:           ");
                    for(int c = 0; c < cardList.get(i).getTagList().size(); c++){
                        System.out.print(cardList.get(i).getTagList().get(c));
                    }
                    System.out.println("");
                }

            }

            if(cardList.get(i) instanceof Card_Spell){

                System.out.println("ID:             "+cardList.get(i).getID());
                System.out.println("Name:           "+cardList.get(i).getName());
                System.out.println("Creator:        "+cardList.get(i).getCreator());

                System.out.println("Type:           "+((Card_Spell) cardList.get(i)).getType());
                System.out.println("Effect:         "+( cardList.get(i)).getEffectText());

                // printing card tags
                if(cardList.get(i).getTagList().size() != 0){
                    System.out.print("Tags:           ");
                    for(int c = 0; c < cardList.get(i).getTagList().size(); c++){
                        System.out.print(cardList.get(i).getTagList().get(c));
                    }
                    System.out.println("");
                }

            }

            System.out.println("");
        }

    }


}
