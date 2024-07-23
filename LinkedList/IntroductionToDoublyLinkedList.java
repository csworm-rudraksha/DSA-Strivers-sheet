package LinkedList;

public class IntroductionToDoublyLinkedList {
    Node constructDLL(int arr[]) {
        // Code here
        if(arr.length==0)return null;
        Node head= new Node(arr[0]);
        Node t=head;
        Node t1=head;
        for(int i=1;i<arr.length;i++){
            t.next=new Node(arr[i]);
            t=t.next;
            t.prev=t1;
            t1=t1.next;
        }
        return head;
    }

}
