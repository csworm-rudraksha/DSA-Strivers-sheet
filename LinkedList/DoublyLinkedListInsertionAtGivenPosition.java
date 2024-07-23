package LinkedList;

public class DoublyLinkedListInsertionAtGivenPosition {
    void addNode(Node head_ref, int pos, int data)
    {
        // Your code here
        Node mover = head_ref;
        for(int i=0;i<pos;i++) mover=mover.next;
        Node newNode = new Node(data);
        if(mover.next!=null){
            Node temp = mover.next;
            mover.next=newNode;
            newNode.prev=mover;
            newNode.next=temp;
            temp.prev=newNode;
        }else{
            mover.next=newNode;
            newNode.prev=mover;
            newNode.next=null;
        }
    }
}
