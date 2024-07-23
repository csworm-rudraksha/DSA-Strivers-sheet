package LinkedList;

public class CountLinkedListNodes {
    public int getCount(Node head) {
        // code here
        int count =0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
