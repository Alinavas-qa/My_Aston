package org.alinavas;
//заполняем массив 1
public class Array {
    public static void main (String[] args){
        int n = 10;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=1;
            System.out.println("arr[" +i + "] = " + arr[i]);
        }
        System.out.println("End");
    }
}
