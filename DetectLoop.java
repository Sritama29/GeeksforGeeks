import java.util.*;
 
public class LinkedList {
     
    static Node head;  
    static class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
   
    static public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
      static boolean detectLoop(Node h){
        HashSet<Node> s = new HashSet<Node>();
        while (h != null){
            if (s.contains(h))
                return true;
            s.add(h);
            h = h.next;
        }
         return false;
    }
     
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
          
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);
          
       list.head.next.next.next.next = list.head;
  
        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
     
    }
}
