package org.example;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Рекс");
        Animal cat = new Cat("Мурчик");
        System.out.println(dog.getName() + " каже: " + dog.makeSound());
        System.out.println(cat.getName() + " каже: " + cat.makeSound());

        Point point = new Point(10.5, 20.0);
        point.moveTo(15.0, 30.5);
        System.out.println("Point: (" + point.getX() + ", " + point.getY() + ")");

        Smartphone phone = new Smartphone(46.4825, 30.7233);
        phone.makeCall();

        Car car1 = new Car(10000, 2020, 150);
        Car car2 = new Car(12000, 2021, 180);
        System.out.println("Порівняння car1 і car2: " + car1.compareTo(car2));
    }
}