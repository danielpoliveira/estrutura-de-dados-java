package com.example.desafio.main.modelo;

public class MyStack extends CustomCollection  {

    public MyStack() {
        super(1);
    }

    public void add(int element) {
        int[] temp = new int[capacity+1];

        if (used >= 0) System.arraycopy(data, 0, temp, 0, used);
        data = temp;

        super.add(element, used);
        capacity++;
    }

    public void pop() {
        super.removeLastElement();
    }
}
