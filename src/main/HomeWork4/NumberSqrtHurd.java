package main.HomeWork4;
// используем Вавилонский метод вычисления значения корня
public class NumberSqrtHurd {
    public static void main(String[] args) {
      double oper1 = 0.00001;
      double oper2 = 368.25;
        while ((oper2 - 368.25 / oper2) > oper1) {
            oper2 = (oper2 + 368.25/oper2) / 2;
        }
        System.out.println("Корень из числа 368,28 = " + oper2);
    }
}
