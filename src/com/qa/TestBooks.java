package com.qa;

public class TestBooks {
    public static void main(String[] args) {
        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("title", arr, 10.99);
        Book b2 = new Book("title2", arr, 5.99);
        Book b3 = new Book("title3", arr, 1.00);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book[] bookArray = new Book[3];

        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        for (int x = 0; x < bookArray.length; x++){
            System.out.println(bookArray[x]);
        }

        //Car
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("Renault", "Megane", 2007);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Make of car1: " + car1.getMake());
        System.out.println("Model of car2: " + car2.getModel());

        car1.setYearofManufacture(2023);
        car2.setModel("Clio");

        System.out.println(car1);
        System.out.println(car2);

        car1.accelerate(40);
        car2.accelerate(30);

        System.out.println("Current speed of car1: "+ car1.getCurrentSpeed());
        System.out.println("Current speed of car2: "+ car2.getCurrentSpeed());

        car1.brake(20);
        car2.brake(10);

        System.out.println("Current speed of car1 after braking: "+ car1.getCurrentSpeed());
        System.out.println("Current speed of car2 after braking: "+ car2.getCurrentSpeed());

    }
}
