package abstractclasseschallenge;

public abstract class ListItem {

    private ListItem previousItem;
    private ListItem nextItem;
    private Object value;

    public ListItem(Object value) {
        this.previousItem = null;
        this.nextItem = null;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public abstract void previousItem();
    public abstract void nextItem();

    public abstract void setPreviousItem(ListItem previousItem);
    public abstract void setNextItem(ListItem nextItem);

    public abstract int compareTo(ListItem listItem);

}
