package main;

public class HW5_Fibonachi {
        public static void main(String[] args) {
            int[] num = new int[11];
            num[0] = 0;
            num[1] = 1;
            System.out.println("Значение по формуле рассчета Фибоначи с 1 до 11 =");
            for (int i = 2; i < num.length; i++) {
                num[i] = num[i - 1] + num[i - 2];
            }
            for (int i = 0; i < num.length; ++i) {
                System.out.println(num[i]);
            }
        }
    }

