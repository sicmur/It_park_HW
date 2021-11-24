package main.HW6;

import java.util.Scanner;

public class ArrayMaxMinAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение длины массива array:");
        int n = input.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * n;
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (double v : array) {
            if (max < v)
                max = v;
            if (min > v)
                min = v;
            avg += v / array.length;
        }

        System.out.println("Расчитываем максимальное значение массива (max) = " + max);
        System.out.println("Расчитываем минимальное значение массива (min) = " + min);
        System.out.println("Расчитываем среднее значение массива (avg) = " + avg);
    }
}


