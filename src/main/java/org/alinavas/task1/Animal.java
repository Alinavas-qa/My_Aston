package org.alinavas.task1;

public abstract class Animal {
    String name;
    static int countAnimal = 0;
    Animal(String name) {
        this.name = name;
        countAnimal++;
    }
    abstract void run(int lengthRun);
    abstract void swim(int lengthSwim);

    public static int getCountAnimal() {
        return countAnimal;
    }
}
