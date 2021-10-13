package com.pb.sugak.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        int a = 0, b = 14, c = 15, d = 35, e = 36, f = 50, g = 51, h = 100;

        if (a <= number && number <= b) {
            System.out.print("Ваше число " + number + " попадает в промежуток" + " [0 - 14]");
        } else if (c <= number && number <= d) {
            System.out.print("Ваше число " + number + " попадает в промежуток" + " [15 - 35]");
        } else if (e <= number && number <= f) {
            System.out.print("Ваше число " + number + " попадает в промежуток" + " [36 - 50]");
        } else if (g <= number && number <= h) {
            System.out.print("Ваше число " + number + " попадает в промежуток" + " [51 - 100]");
        } else
            System.out.print("Ваше число " + number + " не попадает ни в один из промежутков");
        }
    }

