package main.HW7;

public class Tiger {
    private String name;
    private int run;
    private int swim;

    public void Tiger(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String maxRun() {
        if (run <= 1000) {
            System.out.println(name + " пробежал " + run + " метров");
        } else {
            System.out.println(name + " не может столько пробежать");
        }
        return new String("Молодец " + name + ", попей водичку!");
    }

    public String maxSwim() {
        if(swim <= 100) {
            System.out.println(name + " проплыл " + swim + " метров");
        }
        else {
            System.out.println(name + " не может столько проплыть");
        }
        return new String("Молодец " + name + ", держи мясо!");
    }
}

