package Recurrsion.LinkedList;

public class MainLL {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.insertAtLast(5);
        ll.insertAtLast(6);
        ll.insertAtLast(7);
        ll.insertAtLast(8);
        ll.insertAtIndex(2,10);
        ll.display();
    }
}
