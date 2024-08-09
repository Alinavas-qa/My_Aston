package org.alinavas;

public class BreakAndContinue {
    public static void main (String[] args) {
        int i = 0;
        while (true) { // бесконеч цикл
            if(i == 15) {
                break;// когда i==15, мгновенно вых из цикла, само 15 уже не напечат, т.к. sout не будет выполн.
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Вышли из цикла");





        for (int a = 0; a  <= 15; a++) {
            if(a % 2 == 0) {//пока true, выполн contin, a++ и возвраз в условие. А если false, contin не выполн, печатается в консоль, что нечет
                continue;
            }
            System.out.println("Это нечетное число " + a);
        }
    }
}
