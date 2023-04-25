public class Cat {
    private String name;
    private int appetite;
    private boolean eatest;

    public Cat(String name, int appetite, boolean eatest) {
        this.name = name;
        this.appetite = appetite;
        this.eatest = eatest;
    }

    public void eat(int food, int appetite) {
        if (appetite < food) {
            eatest = true;
            System.out.printf("%s наелся.\n", name);
            Plate.setFood(Plate.getFood() - appetite);
        } else {
            System.out.printf("Не достаточно еды, %s остался голодным.\n", name);
        }

    }

    public int getAppetite() {
        return appetite;
    }

    public void info() {
        System.out.printf("Имя: %s  Аппетит: %d Сытость: %b\n", name, appetite, eatest);
    }
}
