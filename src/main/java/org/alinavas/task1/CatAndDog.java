package org.alinavas.task1;

public class CatAndDog {

    public static void main (String[] args) {
        org.alinavas.task1.Animal dogBobik = new org.alinavas.task1.Animal("Бобик");
        org.alinavas.task1.Animal dogBarsik = new org.alinavas.task1.Animal("Барсик");
        dogBobik.run(150);
        dogBobik.swim(150);
        Dog sam = new Dog("Сэм");
        Dog sharik = new Dog("Шарик");
        sam.run(300);
        sam.swim(300);
        sam.swim(10);
        sharik.run(900);


        Cat murka = new Cat("Мурка", 40, false);
        Cat belka = new Cat("Белка", 34,false);
        murka.run(200);
        murka.swim(10);
        belka.run(300);
        murka.run(200);
        murka.swim(10);
        belka.run(300);

        System.out.println("Количество животных: " + org.alinavas.task1.Animal.getCountAnimal());
        System.out.println("Количество кошек: " + Cat.getCountCat());
        System.out.println("Количество cобак: " + Dog.getCountDog());

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Васька", 20, false);
        cat[1] = new Cat("Кузя", 30, false);
        cat[2] = new Cat("Федя", 90,false);

        Bowl bowl1 = new Bowl(100);
        bowl1.info();
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].satiety == false && cat[i].eats < bowl1.food) {
                cat[i].eat(bowl1);
                cat[i].satiety = true;
                System.out.println ("Котик " + cat[i].name + " поел " + cat[i].satiety);
            } else {
                System.out.println("Котик " + cat[i].name + " не поел " + cat[i].satiety);
            }
        }
        bowl1.info();
        bowl1.addFood(100);
        bowl1.info();

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

class Dog extends org.alinavas.task1.Animal {

    String kind = "Собака"; //вид
    static int countDog = 0;
    Dog(String name) {
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

class Cat extends org.alinavas.task1.Animal {

    String kind = "Кошка";
    static int countCat = 0;
    public int eats;
    public boolean satiety;

    public Cat (String name, int eats, boolean satiety) {
        super(name);
        this.eats = eats;
        this.satiety = satiety;
        countCat++;
    }
    public void eat(Bowl bowl) {
        bowl.decreaseFood(eats);
    }

    public void run(int lengthRun) {
        System.out.println( lengthRun > 200 ? kind + " " + "не может столько пробежать." : kind +
                " по кличке " + name + " пробежала " + lengthRun + " м." );
    }
    public void swim(int lengthSwim) {
        System.out.println(kind + " " + "не умеет плавать.");
    }
    public static int getCountCat() {
        return countCat;
    }
}

class Bowl {
    public int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int x) {
        food += x;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info () {
        System.out.println("Всего еды: " + food);
    }
}
