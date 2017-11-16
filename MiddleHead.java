public class Test{     
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
     
    static Node head;
     
    static void setMiddleHead()  {
        if (head == null)
            return;
        Node one_node = head;
        Node two_node = head;
        Node prev = null;
        while (two_node != null && 
               two_node.next != null) {
            prev = one_node;
            two_node = two_node.next.next;
            one_node = one_node.next;
        }
        prev.next = prev.next.next;
        one_node.next = head;
        head = one_node;
    }
    static void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
      
    static void printList(Node ptr) {
        while (ptr != null) {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
      
  
    public static void main(String args[]) {
        head = null;
        int i;
        for (i = 5; i > 0; i--)
            push(i);
         
        System.out.print(" list before: ");
        printList(head);
      
        setMiddleHead();
      
        System.out.print(" list After:  ");
        printList(head);
     
    }
}
