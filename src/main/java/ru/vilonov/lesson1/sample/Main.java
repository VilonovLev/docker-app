package ru.vilonov.lesson1.sample;

import ru.vilonov.lesson1.regular.*;

public class Main {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.sum(14,7);
        adapter.div(14,7);
    }
}

