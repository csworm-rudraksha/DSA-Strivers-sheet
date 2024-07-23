package LinkedList;

public class SearchInLinkedList {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp=head;
        while(temp!=null){
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
}
