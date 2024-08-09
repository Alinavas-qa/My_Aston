package org.alinavas;

import java.util.Scanner;//автоматич прописалось, когда в 9 строчке указали Scanner, а так как class
//Scanner находится в пакете util, а этот пакет автоматич не импортируется, то IJ пропис.этот импорт
//К примеру, класс String находится в пакете lang, который импортируется по умолчанию

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// стандартный поток входных данных System.in
//Scanner-это класс (как и String),а с пом слова new создаем новый объект класса Scanner
//   s-ссылается на объект класса Scanner
        System.out.println("Введите что-нибудь");
        String str = s.nextLine();//создаем новый объект класса String и ссылаем его на то, что будет получено с клавы, используя метод nextLine.
        // То есть, мы у объекта класса Scanner (s) вызвали метод nextLine, кот-й читает с клавы одну строчку чего-нибудь
        // в переменной str хранится то, что мы ввели с клавы
        int x = s.nextInt();//ввести число
        System.out.println("Вы ввели " + str + x);
    }
}
