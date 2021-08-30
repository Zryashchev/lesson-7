package ru.geekbrains.lesson7;

public class Main {

    private static int TIME = 2;
    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Чижик", false,110, true);
        cat[1] = new Cat("Дымок", false,100, true);
        cat[2] = new Cat("Черныш", false,90, true);
        Plate plate = new Plate(750);
        do {
            for (Cat i : cat) {
                    //если в миске заканчивается еда, чтобы накормить котов, она будет добавлена
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    //кот ест
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " проголодался " + i.getHungry() + " и съел " + i.getAppetite() + " грамм кошачьего корма, в настоящий момент является сытым " + (i.getSatiety()));
                }
                System.out.println("\nС момента последней кормежки прошло 2 часа. " + "В данный момент " + TIME++ + " часа(ов/с) по Московскому времени. В миске осталось " + plate.getFood() + " грамм кошачьего корма.\n");
                TIME++;
        }
        while (TIME <= 24);
    }
}