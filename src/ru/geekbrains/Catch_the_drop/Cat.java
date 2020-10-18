package ru.geekbrains.Catch_the_drop;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety){
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate plate){
        if(appetite > 10){

            satiety = false;
            System.out.println("Шрек не насытился ");
            System.out.println("Шреку мало еды( ");
        }else {
            satiety = true;
            System.out.println("Шрек насытился");

            plate.decreaseFood(appetite);
        }

    }
}
