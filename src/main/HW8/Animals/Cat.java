package main.HW8.Animals;

public class Cat extends AnimalsVoice {

   private static final String VIEW_CAT = "Кошка";

    public Cat() {
        super(VIEW_CAT);
    }

    @Override
    public void voice() {
        System.out.println(this.view + " умеет мяукать");
    }
}
