package LinkedList;

public class IntroductionToLinkedList extends Node {

    static Node constructLL(int arr[]) {
        // code here
        if(arr.length==0)return null;
        Node head= new Node(arr[0]);
        Node t=head;
        for(int i=1;i<arr.length;i++){
            t.next=new Node(arr[i]);
            t=t.next;


        }
        return head;
    }
}