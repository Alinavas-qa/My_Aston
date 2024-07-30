package org.alinavas;

public class SetterAndGetter {
    public static void main(String[] args) {
        NewPerson person1 = new NewPerson();
        person1.setName("");
        person1.setAge(1);
        System.out.println("Выводим значение имени в main методе = " + person1.getName());
        System.out.println("Выводим значение возраста в main методе = " + person1.getAge());
        person1.speak();
    }
}

class NewPerson{
    private String name;
    private int age;

    public void setName(String userName) {  // метод сеттер для имени
        if (userName.isEmpty()) {//Метод isEmpty () возвращает значение true, если строка есть пустой «»
            System.out.println("Ошибка. Вы ввели пустое имя");
        } else {
            name = userName;
        }
    }
    public String getName() {   // метод геттер для имени
        return name;
    }

    public void setAge(int userAge) {// метод сеттер для возраста
        if (userAge <= 0) {
            System.out.println("Ошибка. Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }
    public int getAge() {   // метод геттер для возраста
        return age;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " , мне " + age + " лет");
        }
    }
}
