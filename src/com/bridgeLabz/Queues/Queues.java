package com.bridgeLabz.Queues;
/*(UC4-Peek_and_Dequeue)
Ability to dequeue from the beginning
-Use LinkedList to do the Queue Operations*/
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
        public static int remove() {            //to delete the element
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single node
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek() {          // to look out the top element
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(56);
        queue.add(30);
        queue.add(70);

        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
