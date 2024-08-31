package org.prac;

public class ArraysOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();// просто пустая строка для разделения

        //Это цикл for each: результат аналогичный, но тут у нас переменная string ссылается по очереди на каждый
        //эл-т массива strings
        for (String string : strings) { // объявляем переменную string, после двоеточия имя массива, с которым будем работать
            System.out.println(string);
        }
        int [] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int number : numbers1) { //берем массив numbers1 и каждую итерацию подставляем в переменную
            // number(можно ее как угодно назвать) значения 1, 2 и 3, т.е. int number = 1, int number = 2, int number = 3.
            // Затем к переменной sum добав эти числа, получаем сумму эл-ов массива с пом цикла for each.
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
