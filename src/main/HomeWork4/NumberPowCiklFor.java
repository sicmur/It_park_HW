package main.HomeWork4;

public class NumberPowCiklFor {
    public static void main(String[] args) {
        System.out.println(cikl(7,5));
    }

    public static int cikl(int oper1, int oper2) {
        int result = 1;
        for(int c = 1; c <=oper2; c++) {
            result = result * oper1;
        }
        return result;
    }
}
