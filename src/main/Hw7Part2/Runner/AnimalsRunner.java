package main.Hw7Part2.Runner;

import main.Hw7Part2.Cat;
import main.Hw7Part2.Dog;
import main.Hw7Part2.Tiger;

public class AnimalsRunner {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        Cat catCat = new Cat();
        Tiger tigerTiger = new Tiger();

        dogBobik.run(100);
        dogBobik.swim(10);

        catCat.run(200);
        catCat.swim(3);

        tigerTiger.run(500);
        tigerTiger.swim(90);

        System.out.println(dogBobik.run);
        System.out.println(dogBobik.swim);

        System.out.println(catCat.run);
        System.out.println(catCat.swim);

        System.out.println(tigerTiger.run);
        System.out.println(tigerTiger.swim);
    }
}