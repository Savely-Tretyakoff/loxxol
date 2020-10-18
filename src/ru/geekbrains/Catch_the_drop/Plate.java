package ru.geekbrains.Catch_the_drop;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food = 10;
    }

    public void decreaseFood(int val){
        this.food -= val;
    }

    public void info (){
        System.out.println("plate: " + food);
    }
    public void addMore(){
        if(food <=9 ){
            food += 15-food;
            System.out.println("Миска снова наполнена! " + food);
        }
        else{

        }
    }
}

