package main.Hw7Part2;

public class Cat extends AbleAnimals {
    private static final int MAX_DISTANCE_RUN = 200;

    @Override
    public void swim(int distance) {
        System.out.println("Кот - не умеет плавать");
    }

    public void run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.println("Кот пробежал " + distance + " м");
        } else {
            System.out.println("Кот не может столько пробежать");
        }
    }
}