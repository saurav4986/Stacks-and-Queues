package com.bridgeLabz.Stacks;
/*(UC1-Creation_and_push)
Ability to create a Stack of 56->30->70
- Use LinkedList to do the Stack Operations
- Here push will internally call add method on LinkedList.
- So 70 will be added first then 30 and
then 56 to make 56 on top of the Stack*/
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

    public static void main(String[] args) {
        StackDS stackDS = new StackDS();
        stackDS.push(70);
        stackDS.push(30);
        stackDS.push(56);

    }
}