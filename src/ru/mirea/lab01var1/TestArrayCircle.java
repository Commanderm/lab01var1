package ru.mirea.lab01var1;

import java.lang.*;
// Вывести на экран сумму чисел массива с помощью циклов for, while, do while

public class TestArrayCircle {
    public static void main(String[] args) {

        int[] massiv = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayCircle ac1 = new ArrayCircle(massiv);
        System.out.println(ac1.printFor());
        System.out.println(ac1.printWhile());
        System.out.println(ac1.printDo());
    }
}