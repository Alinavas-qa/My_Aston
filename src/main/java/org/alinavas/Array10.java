package org.alinavas;
/*Написать метод, принимающий на вход два аргумента: len
и initialValue, и возвращающий одномерный массив типа int
длиной len, каждая ячейка которого равна initialValue.*/
public class Array10 {
    public static void main(String[] args) {
        retArr(10, 10);
    }
    public static int[] retArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        return arr;
    }
}

