package main.HomeWork4;

public class NumberSqrtMedium {
    public static void main(String[] args) {
        double arg1 = 0.00001;
        double arg2 = 1024;
        while ( (arg2 - 1024/ arg2) > arg1) {
            arg2 = (arg2 + 1024/ arg2) / 2;
        }
        System.out.println("Корень из числа 1024 =" + arg2);
    }
}
