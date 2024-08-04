package org.alinavas;

public class CatAndDog2 {
    public static void main(String[] args) {
        int action;
        Catt[] allCats = new Catt[4];
        allCats[0] = new Catt("Барсик", 5, false);
        allCats[1] = new Catt("Снежок", 30, false);
        allCats[2] = new Catt("Мурзик", 10, false);
        allCats[3] = new Catt("Чернышка", 45, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " поел");
            } else {
                System.out.println("Котик " + allCats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        plate.info();

    }
}
 class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int x) {
        food += x;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
 class Catt {
    public String name;
    public int appetite;
    public boolean fullness;

    public Catt(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
