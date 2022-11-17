package com.bridgeLabz.Queues;
/*(UC3-Queue_Creation)
Ability to create a Queue of 56->30->70
- Use LinkedList to do the Queue Operations
- Here enqueue will internally call append method on LinkedList.
- So 56 will be added first then 30 and then 70 to make 56 on top of the Stack*/
public class Queues {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {           //to find if queue is empty
            return head == null && tail == null;
        }

        public static void add(int data) {      // add method to enqueue the element
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(56);
        queue.add(30);
        queue.add(70);
    }
}
