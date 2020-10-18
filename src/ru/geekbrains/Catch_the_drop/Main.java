package ru.geekbrains.Catch_the_drop;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat("Shrek", 6 , false);
	Plate plate = new Plate(10);

	plate.info();

	cat.eat(plate);

	plate.info();
    }
    String[]  cats = new String[] {"dusya" ,"dulya" ,"murka"};

}
