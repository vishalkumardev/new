class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    public void addElementLast(int val) {
        Node ListNode = new Node(val);

        if (head == null) {
            head = ListNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = ListNode;

        }

    }

    public void addElementFirst(int val) {
        Node ListNode = new Node(val);

        if (head == null) {
            head = ListNode;
        } else {
            ListNode.next = head;
            head = ListNode;
        }

    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }

    public void deleteLast() {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

    }

}

public class Main {

    public static void main(String[] args) {

        LinkedList temp = new LinkedList();
        temp.addElementFirst(0);
        temp.addElementFirst(-10);
        temp.addElementFirst(-20);
        temp.addElementLast(10);
        temp.addElementLast(20);
        temp.addElementLast(30);

        // temp.deleteLast();

        temp.printList();

    }
}