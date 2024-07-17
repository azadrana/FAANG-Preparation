package com.Batch.DSA.D7LinkedList;

public class P02DetectCycleInLinkedList {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void createList(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node currNode =head;
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        while (currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
    }

    public boolean hasCycle(){
        Node first = head;
        Node second = head;
        while (first != null  && first.next !=null){
            first = first.next.next;
            second = second.next;
            if (first == second)
                return true;
        }
        return false;
    }

    public  static void main(String []args){
        P02DetectCycleInLinkedList list = new P02DetectCycleInLinkedList();
        list.createList("A");
        list.createList("B");
        list.createList("C");
        list.createList("D");
        list.printList();
        list.hasCycle();

    }
}
