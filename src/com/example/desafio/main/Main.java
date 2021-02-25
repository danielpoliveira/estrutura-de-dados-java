package com.example.desafio.main;

import com.example.desafio.main.modelo.MyList;
import com.example.desafio.main.modelo.MyQueue;
import com.example.desafio.main.modelo.MyStack;

public class Main {
    public static void main(String[] args) {
        testaList();
    }

    private static void testaQueue() {
        MyQueue queue = new MyQueue();

        System.out.println("\n\nAdicionando elemento -> insert() ");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.print();

        System.out.println("\n\nRemovendo elemento -> pop() ");

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        queue.remove();
        queue.print();

        System.out.println("\n\nAdicionando elemento -> insert() ");
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();
        queue.remove();

        queue.add(8);
        queue.add(5);
        queue.add(2);

        queue.print();
    }

    private static void testaList() {
        MyList list = new MyList(5);

        System.out.println("\n\nAdicionando elemento -> push() ");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        System.out.println("\n\nRemovendo elemento -> pop() ");
        list.remove(3);
        list.remove(2);
        list.remove(1);
        list.remove(1);
        list.print();

        System.out.println("\n\nAdicionando elemento -> push() ");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
    }

    private static void testaStack() {
        MyStack stack = new MyStack();

        System.out.println("\n\nAdicionando elemento -> push() ");
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.print();

        System.out.println("\n\nRemovendo elemento -> pop() ");
        stack.pop();
        stack.pop();
        stack.pop();

        stack.print();

        System.out.println("\n\nAdicionando elemento -> push() ");

        stack.add(10);
        stack.add(21);
        stack.add(35);
        stack.print();
    }

}
