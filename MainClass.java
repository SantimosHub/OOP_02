import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 5, false),
                new Cat("Мурзик", 10, false),
                new Cat("Персик", 12, false),
                new Cat("Ферзик", 8, false),
                new Cat("Пёсик", 20, false),
                new Cat("Бальтазар", 2, false)};
//        Cat cat = new Cat("Barsik", 5, false);

        Plate plate = new Plate(50);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(Plate.getFood(), cat.getAppetite());
        }

        plate.info();

        plate.addFood(50);

        plate.info();




    }
}
