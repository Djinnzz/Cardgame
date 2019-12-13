public class Card_Spell extends Card {

    public enum Type {
        field,
        quick,
        perma
    }

    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
