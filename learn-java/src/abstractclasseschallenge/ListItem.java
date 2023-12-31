package abstractclasseschallenge;

public abstract class ListItem {

    protected ListItem nextItem;
    protected ListItem previousItem;
    protected Object value;

    public ListItem(Object value) {
        this.previousItem = null;
        this.nextItem = null;
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem previous();

    abstract ListItem setNext(ListItem nextItem);
    abstract ListItem setPrevious(ListItem previousItem);

    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
