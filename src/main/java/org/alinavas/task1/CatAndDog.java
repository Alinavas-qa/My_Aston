package org.alinavas.task1;

public class CatAndDog {

    public static void main (String[] args) {

        Dog sam = new Dog("Сэм");
        Dog sharik = new Dog("Шарик");
        sam.run(-300);
        sam.run(200);
        sam.swim(300);
        sam.swim(10);
        sharik.run(900);

        Cat murka = new Cat("Мурка", 40, false);
        Cat belka = new Cat("Белка", 34,false);
        murka.run(200);
        murka.swim(10);
        belka.run(300);
        murka.run(200);
        murka.swim(-10);
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
