package abstractclasseschallenge;

public class MyLinkedList extends ListItem {

    public MyLinkedList(Object value) {
        super(value);
    }

    @Override
    public void previousItem() {

    }

    @Override
    public void nextItem() {

    }

    @Override
    public void setPreviousItem(ListItem previousItem) {
        
    }

    @Override
    public void setNextItem(ListItem nextItem) {

    }

    @Override
    public int compareTo(ListItem listItem) {
        if (listItem.hashCode() > this.hashCode()) {
            return 1;
        } else if (listItem.hashCode() < this.hashCode()) {
            return -1;
        }
        return 0;
    }

}
