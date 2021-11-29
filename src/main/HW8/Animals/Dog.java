package main.HW8.Animals;

public class Dog extends AnimalsVoice {

    private static final String VIEW_DOG = "Собака";

    public  Dog () {
        super(VIEW_DOG);
    }

    @Override
    public void voice() {
        System.out.println(this.view + " умеет гавкать");
    }
}
