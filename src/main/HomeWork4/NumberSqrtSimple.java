package main.HomeWork4;

public class NumberSqrtSimple {
    public static void main(String[] args) {
       double r1 = 0.00001;
       double r2 = 25;
        while ((r2-25/r2) > r1){
            r2 = (r2 + 25/r2)/2;
        }
        System.out.println("Вывести корень из числа 25" + " = " + r2 );
    }
}
