package ru.geekbrains.lesson7;

public class Cat {
private String name;
private int appetite;
private boolean hungry;
private boolean satiety;
        String getName() {
        return name;
        }
        int getAppetite() {
        return appetite;
        }
        boolean getHungry() {
        return hungry;
        }
        boolean getSatiety() {
        return satiety;
        }
        Cat(String name, boolean hungry, int appetite, boolean satiety) {
        this.name = name;
        this.hungry = hungry;
        this.satiety = satiety;
        this.appetite = appetite;
        }
        void eat(Plate p) {
        p.decreaseFood(appetite);
        }
}