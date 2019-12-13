import java.util.ArrayList;

/**
 * Set class: contains a list with all cards of a set
 * */

public class Set {

    String name;

    ArrayList cardList = new ArrayList<Card>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
