public class LinkedlistIS{
    node head;
    node sorted;
 
    class node{
        int val;
        node next;
 
        public node(int val) {
            this.val = val;
        }
    }
 
    void push(int val){
        node newNode = new node(val);
        newNode.next = head;
        head = newNode;
    }
 
    void insertionSort(node headRef) {
        sorted = null;
        node current = headRef;
        while (current != null){
            node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
    }
 
    void sortedInsert(node newNode){
        if (sorted == null || sorted.val >= newNode.val){
            newNode.next = sorted;
            sorted = newNode;
        } else {
            node current = sorted;
            while (current.next != null && current.next.val < newNode.val){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newnode;
        }
    }
    void printlist(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static void main(String[] args)  {
        LinkedlistIS list = new LinkedlistIS();
        list.push(5);
        list.push(20);
        list.push(4);
        list.push(3);
        list.push(30);
        System.out.println("Linked List before Sorting..");
        list.printlist(list.head);
        list.insertionSort(list.head);
        System.out.println("\nLinkedList After sorting");
        list.printlist(list.head);
    }
}
