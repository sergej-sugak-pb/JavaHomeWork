package com.pb.sugak.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую цифру: ");
        int operand1 = in.nextInt();

        System.out.print("Введите вторую цифру: ");
        int operand2 = in.nextInt();

        System.out.println("Введите знак арифметической операции:");
        String sign = in.next();

        if (operand2 == 0 && sign.equals("/")) {
            System.out.print("Делить на ноль нельзя!");
        } else {

            int result = 0;
            switch (sign) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Не верный знак. Калькулятор может только складывать, отнимать, умножать и делить");
            }
            System.out.println(result);
        }
    }
}