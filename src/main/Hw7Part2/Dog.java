package main.Hw7Part2;

import main.Hw7Part2.AbleAnimals;

public class Dog extends AbleAnimals {
    private static final int MAX_DISTANCE_RUN = 500;
    private static final int MAX_DISTANCE_SWIM = 10;

    @Override
    public void swim(int distance) {
        if (distance <= MAX_DISTANCE_SWIM) {
            System.out.println("Бобик проплыл " + distance + " м.");
        } else {
            System.out.println("Бобик не может столько проплыть");
        }
    }

    public void run(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.println("Бобик  пробежал " + distance + " м");
        } else {
            System.out.println("Бобик не может столько пробежать");
        }
    }
}