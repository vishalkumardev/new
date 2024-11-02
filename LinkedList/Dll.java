/**
 * InnerDll
 */
class ListNode {
    int data;
    ListNode next;
    ListNode prev;

    ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    ListNode(int data, ListNode next, ListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

}

class DLinkedList {
    ListNode head;
    ListNode tail;

    DLinkedList() {
        head = null;
        tail = null;
    }

    public void addElementLast(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;
    }

    public void printList() {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void printReverseList() {
        ListNode temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}

public class Dll {
    public static void main(String[] args) {

        DLinkedList newList = new DLinkedList();

        int[] arr = { 1, 2, 3, 4 };

        for (int i = 0; i < arr.length; i++) {
            newList.addElementLast(arr[i]);
        }

        newList.printList();
        newList.printReverseList();

    }
}
