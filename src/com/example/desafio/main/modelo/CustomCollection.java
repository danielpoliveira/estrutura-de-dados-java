package com.example.desafio.main.modelo;

abstract class CustomCollection {
    protected int capacity;
    protected int used;
    protected int[] data;

    public CustomCollection(int size) {
        data = new int[size];
        capacity = size;

        used = 0;
    }

    public void add(int element, int index) {

        if(index < 0 || capacity <= index ) {
            System.out.println("ERRO");
            return;
        }

        data[index] = element;
        used++;
    }

    public void removeLastElement() {
        int[] temp;

        if (used <= 1) {
            temp = new int[1];
            used = 0;

            capacity = 1;
        } else {
            temp = new int[capacity--];
            used--;

            System.arraycopy(data, 0, temp, 0, used);
        }

        data = temp;
    }

    public void print() {
        System.out.println("Capacidade: " + capacity);
        System.out.println("Espaço usado (em indexes): " + used);

        System.out.print("vetor: [ ");
        for (int i = 0; i < used; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("]\n");

        System.out.print("vetor real: [ ");
        for (int i = 0; i < capacity; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("]\n");
    }
}
