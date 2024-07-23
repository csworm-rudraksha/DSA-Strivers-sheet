package LinkedList;

public class LinkedListInsertionAtEnd {
    Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
