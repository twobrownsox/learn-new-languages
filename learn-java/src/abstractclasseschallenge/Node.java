package abstractclasseschallenge;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.nextItem;
    }

    @Override
    public ListItem previous() {
        return this.previousItem;
    }

    @Override
    public ListItem setNext(ListItem nextItem) {
        this.nextItem = nextItem;
        return this.nextItem;

    }

    @Override
    public ListItem setPrevious(ListItem previousItem) {
        this.previousItem = previousItem;
        return this.previousItem;
    }

    @Override
    public int compareTo(ListItem listItem) {
        if (listItem != null) {
            return ((String) super.getValue()).compareTo((String) listItem.getValue() ); //String class haa built in compareTo method
        } else {
            return -1;
        }
    }

}
