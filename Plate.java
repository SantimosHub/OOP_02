public class Plate {
    private static int food;

    public Plate(int food) {
        Plate.food = food;
    }

    public void info() {
        System.out.printf("В тарелке %d еды", food);
        System.out.println();
    }

    public void addFood(int someFood){
        food += someFood;
        System.out.printf("Добавили в тарелку %d еды", someFood);
        System.out.println();
    }

    public static int getFood() {
        return food;
    }

    public static void setFood(int food) {
        Plate.food = food;
    }



}
