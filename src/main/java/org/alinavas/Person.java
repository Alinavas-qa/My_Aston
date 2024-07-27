package org.alinavas;
/* 2) Создать массив из 5 сотрудников.
 Пример:
вначале объявляем массив объектов
Person[] persArray = new Person[5];
потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
*/
public class Person {
    String fio;
    String jobTitle;
    String email;
    String tel;
    int salary;
    int age;
    Person (String fio, String jobTitle, String email, String tel, int salary, int age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    void info() {
        System.out.println(fio + " " + jobTitle + " " + email + " " + tel + " " + salary + " " + age);
    }
    public static void main(String[] args) {
        Person [] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 30);
        persArray[0].info();
        persArray[1] = new Person("Petrov Ivan", "QA Engineer", "i@mailbox.com",
                "89639007701", 35000, 31);
        persArray[1].info();
        persArray[2] = new Person("Ivanov Petr", "AQA Engineer", "ii@mailbox.com",
                "89639007702", 45000, 32);
        persArray[2].info();
        persArray[3] = new Person("Petrov Petr", "BA", "iii@mailbox.com",
                "89639007703", 55000, 33);
        persArray[3].info();
        persArray[4] = new Person("Grudkin Vitaliy", "Developer", "iiii@mailbox.com",
                "73472465123", 65000, 47);
        persArray[4].info();

    }
}
