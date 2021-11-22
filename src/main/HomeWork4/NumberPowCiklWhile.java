package main.HomeWork4;

public class NumberPowCiklWhile {
    public static void main(String[] args) {
        int arg1 = 7;
        int arg2 = 1;
        int result = 1;
        while (result <=15) {
            arg2 = arg2 * arg1;
            System.out.println(arg1 + " в степени " + result + " = " + arg2);
            result++;
        }
    }
}
