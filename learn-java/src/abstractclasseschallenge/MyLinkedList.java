package abstractclasseschallenge;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // the list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // new item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at the end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previousItem.setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node without a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparision = currentItem.compareTo(item);
            if (comparision == 0) {
                //found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext((currentItem.next()));
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious((currentItem.previous()));
                    }
                }
                return true;
            } else if (comparision < 0) {
                currentItem = currentItem.next();
            } else { // comparision > 0
                // we are at an item greater that the one to be deleted
                // so the item is not in the list
                return false;
            }
        }

        // we have reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
