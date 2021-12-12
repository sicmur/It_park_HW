package main.Hw7Part2;

public class Tiger extends AbleAnimals{
    private static final int MAX_DISTANCE_RUN = 1000;
    private static final int MAX_DISTANCE_SWIM = 100;

    @Override
    public void run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.println("Тигр пробежал " + distance + " м.");
        } else {
            System.out.println("Тигр не может столько пробежать");
        }
    }

    public void swim(int distance) {
        if (distance <= MAX_DISTANCE_SWIM) {
            System.out.println("Тигр проплыл " + distance + " м.");
        } else {
            System.out.println("Тигр не может столько проплыть");
        }
    }
}