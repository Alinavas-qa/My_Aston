package org.alinavas.task1;

public class Dog extends Animal {

    String kind = "Собака"; //вид
    static int countDog = 0;
    Dog(String name) {
        super(name);
        countDog++;
    }
    public void run(int lengthRun) {
        System.out.println((lengthRun > 500) || (lengthRun <= 0) ? kind + " " + "не может столько пробежать." : kind + " по кличке " + name + " пробежала " + lengthRun + " м." );
    }
    public void swim(int lengthSwim) {
        System.out.println((lengthSwim > 10) || (lengthSwim <= 0) ? kind + " " + "не может столько проплыть." : kind + " по кличке " + name + " проплыла " + lengthSwim + " м." );
    }
    public static int getCountDog() {
        return countDog;
    }
}
