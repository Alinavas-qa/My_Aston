package org.alinavas;
/*Создать класс Park с внутренним классом, с помощью объектов
которого можно хранить информацию об аттракционах, времени их
работы и стоимости.
3.*/
public class Park {
    private String name;
    private String time;
    private int price;
    public Park (String name, String time, int price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }
    void info() {
        System.out.println(name + " " + time + " " + price);
    }
    public static void main(String[] args) {
        Park park1 = new Park("Park1", "10:00-22:00", 3000);
       park1.info();
        Park park2 = new Park("Park2", "11:00-23:00", 4000);
        park2.info();
    }
}
