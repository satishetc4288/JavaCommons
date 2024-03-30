package com.satish.exp.collections;


public class TheLinkedList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    public TheLinkedList() {
    }

    public boolean linkLast(E elem){
        Node<E> l = last;
        Node<E> newNode = new Node<>(null, l, elem);
        last = newNode;
        if(l == null){
            first = newNode;
        }else{
            l.next = last;
        }
        size++;
        return true;
    }

    public boolean linkFirst(E elem){
        Node<E> f = first;
        Node<E> newNode = new Node<>(f, null, elem);
        first = newNode;
        if(f == null){
            last = newNode;
        }else{
            f.prev = first;
        }
        size++;
        return true;
    }

    public boolean add(E elem){
        return linkLast(elem);
    }

    public E get(int index){

        if (index > size || index < 1){
            throw new IndexOutOfBoundsException();
        }

        Node<E> node;

        if(index > (size >> 2)){
            node = last;
            for (int i = size; i>index; i--){
                node = node.prev;
            }
        }else{
            node = first;
            for (int i = 1; i<index; i++){
                node = node.next;
            }
        }
        return  node.getE();
    }

    private static class Node<E> {
        private E e;
        private Node<E> next;
        private Node<E> prev;

        public Node(Node<E> next, Node<E> prev, E e){
            this.next = next;
            this.prev = prev;
            this.e = e;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        TheLinkedList<String> linkedList = new TheLinkedList<>();
        linkedList.add("first");
        linkedList.add("sec");
        linkedList.add("3rd");
        linkedList.add("4rth");
        linkedList.add("5th");
        linkedList.add("6th");
        linkedList.add("7th");
        linkedList.add("8th");

        System.out.println(linkedList.get(8));
    }
}
