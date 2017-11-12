// Java program to swap two given nodes of a linked list
 
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
 
class LinkedList{
    Node head; 
 
    public void swapNode(int x, int y){
       if (x == y) return;
       Node prevX = null, curtX = head;
        while (curtX != null && curtX.data != x){
            prevX = curtX;
            currX = curtX.next;
        }
        Node prevY = null, curtY = head;
        while (curtY != null && curtY.data != y){
            prevY = curtY;
            curtY = curtY.next;
        }
        if (curtX == null || curtY == null)
            return;
        if (prevX != null)
            prevX.next = curtY;
        else 
        head = curtY;
 
        if (prevY != null)
            prevY.next = curtX;
        else 
        head = curtX;
        
        Node temp = curtX.next;
        curtX.next = curtY.next;
        curtY.next = temp;
    }
 
     public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
 
    public void printList(){
        Node tNode = head;
        while (tNode != null){
            System.out.print(tNode.data+" ");
            tNode = tNode.next;
        }
    }
 
    public static void main(String[] args){
        LinkedList list = new LinkedList();
 
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
 
        System.out.print("\n Linked list before calling swapNodes() ");
        llist.printList();
 
        llist.swapNodes(4, 3);
 
        System.out.print("\n Linked list after calling swapNodes() ");
        llist.printList();
    }
}
