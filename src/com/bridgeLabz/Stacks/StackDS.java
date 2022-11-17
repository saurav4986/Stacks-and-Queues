package com.bridgeLabz.Stacks;
/*(UC2-Peek_and_pop)
Ability to peak and pop from the Stack till it is empty 56->30->70
- Use LinkedList to do the Stack Operations*/
public class StackDS {
    public static Node head = null;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void push(int data) {         //push method to add the element in stack
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static int pop() {
        if(isEmpty()) {
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        Node top = head;
        return top.data;
    }

    public static void main(String[] args) {
        StackDS stackDS = new StackDS();
        stackDS.push(70);
        stackDS.push(30);
        stackDS.push(56);

        while(!stackDS.isEmpty()) {
            System.out.print(stackDS.peek()+"  ");
            stackDS.pop();
        }

    }
}