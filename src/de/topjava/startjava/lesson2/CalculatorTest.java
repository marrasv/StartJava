package de.topjava.startjava.lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main (String[] args) {
        Scanner s1 = new Scanner(System.in);
        Calculator c = new Calculator();
        String answer;
        do {
            System.out.print("Введите первое число: ");
            int num1 = s1.nextInt();
            c.setA(num1);
            System.out.print("Введите знак математической операции:");
            char sign = s1.next().charAt(0);
            c.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = s1.nextInt();
            c.setB(num2);

            c.Calc();
            do{
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = s1.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}