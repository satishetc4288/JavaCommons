package com.satish.exp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class LinkedList {
    Node head;
    int size;

    public LinkedList(int item) {
        head = new Node(item);
    }

    //Your code starts here

    public void prepend(int item) {
        Node newNode = new Node(item);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public int length() {
        return size;
    }

    //Your code ends here
}

class Node {

    int value;
    Node next;

    public Node(int item) {
        value = item;
    }

    public void setNext(Node next){
        this.next = next;
    }
}

public class Test {
    public static void main(String[] args) throws java.lang.Exception {

        for(int i=1; i<101; i++){

            if(i%3== 0  && i%7== 0){
                System.out.println("HappyDays");
                continue;
            }
            if(i%3== 0){
                System.out.println("Happy");
                continue;
            }

            if(i%7== 0){
                System.out.println("Days");
                continue;
            }
            System.out.println(i);
        }
    }
}
