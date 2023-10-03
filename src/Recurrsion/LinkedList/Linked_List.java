package Recurrsion.LinkedList;

public class Linked_List {
    Node head;
    Node tail;
    int size;
    public class Node<T>{
        T value;
        Node next;

        public Node(T value){
            this.value = value;
            next = null;
        }
    }

    public void insertAtLast(int value){
        if(head==null){
            head = new Node<Integer>(value);
            tail = head;
            size=1;
        }
        else{
            Node<Integer> temp = new Node<>(value);
            tail.next = temp;
            tail = temp;
            size++;
        }
    }


    public void display(){
        if(head==null){
            return;
        }
        if(size==0){
            return;
        }
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("size = "+size);
        System.out.print(" -> Head = "+head.value);
        System.out.print(" -> Tail = "+tail.value +"\n");

    }

    public void insertAtBeginning(int value){
        if(head==null){
            head = new Node<Integer>(value);
            tail = head;
            size =1;
        }

        else{
            Node temp = new Node<>(value);
            temp.next = head;
            head = temp;
            size++;
        }
    }

    public void deleteFromBeginning(){
        if(head==null){
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteFromEnd(){
        if(head==null){
            return;
        }
        Node temp = head;
        while (temp.next!=tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteFromIndex(int index){

        if (head==null){
            return;
        }
        if(size<index){
            return;
        }
        Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;

    }

    public void insertAtIndex(int index,int value){
        if (head==null){
            return;
        }

        Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public Linked_List reverseLinkedList(Linked_List l){
        Linked_List result = new Linked_List();
        Node temp = l.head;
        while(temp!=null){
            result.insertAtBeginning((int)(temp.value));
            temp = temp.next;
        }
        return result;
    }

}
