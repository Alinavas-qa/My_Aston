package org.alinavas.task1;

public class Bowl {

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
