package org.alinavas.task1;

public class Cat extends Animal {

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
        System.out.println((lengthRun > 200) || (lengthRun <= 0)? kind + " " + "не может столько пробежать." : kind +
                " по кличке " + name + " пробежала " + lengthRun + " м." );
    }
    public void swim(int lengthSwim) {
        System.out.println(kind + " " + "не умеет плавать.");
    }
    public static int getCountCat() {
        return countCat;
    }
}
