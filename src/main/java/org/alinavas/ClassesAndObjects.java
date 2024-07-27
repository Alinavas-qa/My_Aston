package org.alinavas;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person(); // Переменную person1 типа Person ссылаем на новый объект класса Person
        person1.name = "Петя";
        person1.age = 30;
        Person person2 = new Person();
        person2.name = "Гриша";
        person2.age = 20;
        int year1 = person1.calculateYearsToRetirement();//помещаем в переменные значения, которые получили ниже
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " + year1 + " лет");
        System.out.println("Первому человеку до пенсии: " + year2 + " лет");

    }
}
class Person{
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;// возвращает значение в место, где вызван этот метод в main
    }
    void speak() {
        for (int i = 1; i < 3; i++)
            System.out.println("Меня зовут " + name + ", мне " + age + " года");
    }
}
// RКак только return вызывается, метод прекращ свою работу, после return бесполезно что-либо писать (еcли нет if)