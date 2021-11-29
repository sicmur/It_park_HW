package main.HW7;

public class  Dog  {
    private String name;
    private int run;
    private int swim;

    public void Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String maxRun() {
        if (run <= 500) {
            System.out.println(name + " пробежал " + run + " метров");
        } else {
            System.out.print(name + " не может столько пробежать");
        }
        return new String("Молодец " + name + ", держи вкусняшку!");
    }

    public String maxSwim() {
           if(swim <= 10) {
               System.out.println(name + " проплыл " + swim + " метров");
           }
           else {
               System.out.println(name + " не может столько проплыть");
           }
           return new String("Молодец " + name + ", держи вкусняшку!");
        }
}







