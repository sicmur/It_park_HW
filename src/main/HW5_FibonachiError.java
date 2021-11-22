package main;
import java.util.Scanner;

public class HW5_FibonachiError {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите значение:");
    int arg = scanner.nextInt();
    int[] num = new int[arg];
    num [0] = 0;
    num [1] = 1;
    for (int i = 2; i < arg; ++i) {
        num[i] = num[i - 1] + num[i - 2];
    }
    for (int i = 0; i < arg; ++i) {
        System.out.println(num[i]);
    }
    }
}