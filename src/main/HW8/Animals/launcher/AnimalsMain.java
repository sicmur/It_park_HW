package main.HW8.Animals.launcher;

import main.HW8.Animals.AnimalsVoice;
import main.HW8.Animals.Cat;
import main.HW8.Animals.Dog;
import main.HW8.Animals.Tiger;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        AnimalsVoice[] animals = new AnimalsVoice[] {dog,cat, tiger};
        for(AnimalsVoice animalsVoice: animals)    {
            animalsVoice.voice();
        }
    }
}
