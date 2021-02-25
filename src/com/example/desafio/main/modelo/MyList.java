package com.example.desafio.main.modelo;

public class MyList extends CustomCollection {
    public MyList(int size) {
        super(size);
    }

    public void add(int element) {
        if (used+1 == capacity) {
            int[] temp = new int[2 * capacity];

            if (capacity >= 0) System.arraycopy(data, 0, temp, 0, capacity);

            capacity *= 2;
            data = temp;
        }

        super.add(element, used);
    }

    public void remove(int index) {
        if (index < 0 || used <= index) {
            System.out.println("Err: Index invalid: "+ index);
            return;
        }

        int[] temp = new int[capacity--];

        for (int i = 0, j = 0; i < capacity; i++) {
            if (i == index) {
                continue;
            }

            temp[j++] = data[i];
        }

        data = temp;
        used--;
    }
}


