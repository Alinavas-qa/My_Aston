package org.alinavas;
/*Создать классы Собака и Кот с наследованием от класса Животное.
Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
препятствия. Результатом выполнения действия будет печать в консоль. (Например,
dogBobik.run(150); → 'Бобик пробежал 150 м.');
У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот
не умеет плавать, собака 10 м.).
Добавить подсчет созданных котов, собак и животных.
Расширить задачу, добавив для котов возможность есть из миски, выполнив следующие пункты:
● Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается поесть 15-20).
● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
удалось покушать (хватило еды), сытость = true.
● Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть
наполовину сыт (это сделано для упрощения логики программы).
● Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом
вывести информацию о сытости котов в консоль.
● Добавить метод, с помощью которого можно было бы добавлять еду в миску.
*/
public class CatAndDog {
    public static void main (String[] args){
        Animal dogBobik = new Animal("Бобик");
        Animal animal1 = new Animal("Барсик");
        dogBobik.run(150);
        dogBobik.swim(150);
        animal1.swim(1);
        Dog sam = new Dog("Сэм");
        Dog sharik = new Dog("Шарик");
        sam.run(300);
        sam.swim(300);
        sam.swim(10);
        sharik.run(900);
        Cat murka = new Cat("Мурка", false);
        Cat belka = new Cat("Белка", false);
        murka.run(200);
        murka.swim(10);
        belka.run(300);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Vasilij", false);
        cats[1] = new Cat("Snezhok", false);
        cats[2] = new Cat("Kuzma", false);
        cats[3] = new Cat("Bombilo", false);
        cats[4] = new Cat("Kote", false);
        Cat.Bowl bowl1 = new Cat.Bowl(100);
        bowl1.info();
       // Cat.Bowl.eat(40);
        //plate=bowl1
        /*for (int i = 0; i < cats.length; i++) {
            if (Cat.Bowl.cats[i].eat < bowl1.food){
                cats[i].eat(plate);
                cats[i].fullness = true;
                System.out.println("Котик " + cats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + cats[i].name + " не поел!");
            }
        }*/
        bowl1.eat(2);
        bowl1.eat(6);
        bowl1.info();
        bowl1.eat(90);
        bowl1.info();

        /*Cat murka = new Cat("Мурка", false);
        Cat belka = new Cat("Белка", false);
        murka.run(200);
        murka.swim(10);
        belka.run(300);*/



        System.out.println("Количество животных: " + Animal.getCountAnimal());
        System.out.println("Количество кошек: " + Cat.getCountCat());
        System.out.println("Количество cобак: " + Dog.getCountDog());
        //Cat.Bowl bowl1 = new Cat.Bowl(50);
        //bowl1.downFood(40);
       // Cat.Bowl bowl1 = new Cat.Bowl(100);
        //bowl1.downFood(51);
        //bowl2.addFood(30);
        //Cat.Bowl bowl1 = new Cat.Bowl(100);

        /*Cat[] cats = new Cat[5];
        cats[0] = new Cat("Vasilij", false);
        cats[1] = new Cat("Snezhok", false);
        cats[2] = new Cat("Kuzma", false);
        cats[3] = new Cat("Bombilo", false);
        cats[4] = new Cat("Kote", false);
        Cat.Bowl bowl1 = new Cat.Bowl(100);
        Cat.Bowl.eat(5);
        Cat.Bowl.eat(90);*/

        /*for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].eat < bowl1.food){
                //cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println("Котик " + cats[i].name + " поел");
            } else {
                System.out.println("Котик " + cats[i].name + " не поел");
            }
        }*/
        //Cat.bowl.addFood(20);

    }
}
class Animal {
    String name;
    static int countAnimal = 0;
    Animal(String name) {
        this.name = name;
        countAnimal++;
    }
    void run(int lengthRun) {
        System.out.println(name + " пробежал " + lengthRun + " м.");
    }
    void swim(int lengthSwim) {
        System.out.println(name + " проплыл " + lengthSwim + " м.");
    }
    public static int getCountAnimal() {
        return countAnimal;
    }
}
/*У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот
не умеет плавать, собака 10 м.).*/
class Dog extends Animal {
    String kind = "Собака";
    static int countDog = 0;
    Dog (String name) {
        super(name);
        countDog++;
    }
    public void run(int lengthRun) {
        System.out.println( lengthRun > 500 ? kind + " " + "не может столько пробежать." : kind + " по кличке " + name + " пробежала " + lengthRun + " м." );
    }
    public void swim(int lengthSwim) {
        System.out.println( lengthSwim > 10 ? kind + " " + "не может столько проплыть." : kind + " по кличке " + name + " проплыла " + lengthSwim + " м." );
    }
    public static int getCountDog() {
        return countDog;
    }
}
//Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//удалось покушать (хватило еды), сытость = true.
class Cat extends Animal {
    String kind = "Кошка";
    static int countCat = 0;
    public static boolean satiety;
    //public static int eat;
    //int food;
    Cat (String name, boolean satiety) {
        super(name);
       this.satiety = satiety;
        countCat++;
    }
    public void run(int lengthRun) {
        System.out.println( lengthRun > 200 ? kind + " " + "не может столько пробежать." : kind + " по кличке " + name + " пробежала " + lengthRun + " м." );
    }
    public void swim(int lengthSwim) {
        System.out.println(kind + " " + "не умеет плавать.");
    }
    public static int getCountCat() {
        return countCat;
    }
   /* public void downFood (){
        int difference = food - eat;
        System.out.println(difference < 0 ? "В миске нет столько еды, нужно лопать меньше, " + "кот сыт: " + satiety : "В миске еще осталось еды: " + difference + ", кот сыт: " + !satiety);
    }*/

    public static class Bowl{ // При объявл внутр класса присут. служ static(вложенный класс)
        public int food;
        Bowl(int food) {
            this.food = food;
        }
      /* public void eat (int downFood) {
            int difference = food - downFood;
            System.out.println(difference < 0 ? "В миске нет столько еды, нужно лопать меньше, " + "кот сыт: " + satiety : "В миске еще осталось еды: " + difference + ", кот сыт: " + !satiety);
        }
        public void addFood(int add) {
            int difference = food + add;
            System.out.println("Еды в миске стало: " + difference);
        }*/
      public void eat(int n) {
          food -= n;
          System.out.println(food);
      }
        public void addFood(int x) {
            food += x;
        }
        public void info() {
            System.out.println("Всего еды: " + food);
        }
    }
}
