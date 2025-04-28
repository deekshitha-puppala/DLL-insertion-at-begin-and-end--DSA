public class DoublyLinkedList {
    private class Node {
        int data;
        Node next;
        Node prev;

       public Node(int data) {
            this.data = data;
        }
        public Node (int data, Node next, Node prev) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
    Node head;
//Creating nodes
    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null) {
        head.prev = node;
        }
        head = node;
    }

    
    // creating last node
    public void insertLast(int data) {
        Node node = new Node(data);
        Node last = head;

        node.next = null;
        // what if initially head==null--->?
        if(head == null) {
            head.prev = null;
            head = node;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp.next!=null) {
            System.out.print(temp.data + " -> ");
            last  = temp; 
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.print("End");

        System.out.println();
        // in reverse
        System.out.println("Printing in reverse");

        while(last != null) {
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.print("Start");

    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(45);
        list.insertLast(99);

        list.display();

    }
}
