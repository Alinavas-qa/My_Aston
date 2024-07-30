package org.alinavas;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person(); // Переменную person1 типа Person ссылаем на новый объект класса Person, все его
        //значения name и age изначально null!!!
        person1.setNameAndAge("Роман", 30);
        person1.speak();
        Person person2 = new Person();
        String str = "Вова";
        int x = 27;
        person2.setNameAndAge(str, 40);// еще 1 способ назначить имя
        person2.speak();
        int year1 = person1.calculateYearsToRetirement();//помещаем в переменные значения, которые получили ниже
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " + year1 + " лет");
        System.out.println("Первому человеку до пенсии: " + year2 + " лет");
    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String userName, int userAge) {//создаем метод, который будет присваивать имя объекту
        name = userName;// наш name будет равен тому username, который приходит из параметра
        age = userAge;// наш age будет равен тому userAge, который приходит из параметра
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;// возвращает значение в место, где вызван этот метод в main
    }
    void speak() {
        for (int i = 1; i < 3; i++)
            System.out.println("Меня зовут " + name + ", мне " + age + " года");
    }
}
// Как только return вызывается, метод прекращ свою работу, после return бесполезно что-либо писать (еcли нет if)