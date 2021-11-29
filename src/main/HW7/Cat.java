package main.HW7;

public class Cat {
    private String name;
    private int run;
    private boolean swim;

    public void Cat(String name, int run, boolean swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String maxRun() {
        if (run <= 200) {
            System.out.println(name + " пробежал " + run + " метров");
        } else {
            System.out.print(name + " не может столько пробежать");
        }
        return new String("Молодец " + name + ", держи рыбку!");
    }

    public boolean maxSwim() {
        System.out.println(name + " не умеет плавать ");
        return true;
    }
}




