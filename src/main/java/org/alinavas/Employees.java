package org.alinavas;
/* 1) Создать класс "Сотрудник" с полями: ФИО, должность, email,
телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании
объекта.
Внутри класса «Сотрудник» написать метод, который выводит
информацию об объекте в консоль*/
public class Employees {
    public static void main (String[] args){
        MainEmployees employee1 = new MainEmployees("Родион", "Батькин", "Батькович", "проводник", "lala@yandex.ru", 89, 10000, 35);
        employee1.info();
        MainEmployees employee2 = new MainEmployees("Иван", "Иванов", "Иванович", "борт-проводник", "laela@yandex.ru", 22, 20000, 34);
        employee2.info();
    }
}
class MainEmployees {
    String name;
    String lastName;
    String surname;
    String jobTitle;
    String email;
    int tel;
    int salary;
    int age;
    MainEmployees (String name, String lastName, String surname, String jobTitle, String email, int tel, int salary, int age ) {
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    void info(){
        System.out.println(name + " " + lastName + " " + surname + " " + jobTitle + " "  + email + " " + tel + " " + salary + " " + age);
    }
}