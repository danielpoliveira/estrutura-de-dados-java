package com.example.desafio.main.modelo;

public class MyQueue extends CustomCollection {

    public MyQueue() {
        super(1);
    }

    public void add(int element) {
        int[] temp = new int[capacity+1];

        if (used >= 0) System.arraycopy(data, 0, temp, 1, used);
        data = temp;

        super.add(element, 0);
        capacity++;
    }

    public void remove() {
        super.removeLastElement();
    }
}
