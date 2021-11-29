package main.HW8.Animals;

public class Tiger extends AnimalsVoice{

    private static final String TIGER = "Тигар";

    public Tiger() {
        super(TIGER);
    }

    @Override
    public void voice() {
        System.out.println(this.view + " умеет рычать");
    }
}
