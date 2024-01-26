package de.topjava.startjava.lesson2;

public class CalculatorOld{
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        char sign; // +, -, *, /, ^, %
        sign = '^';
        if (sign == '+'){
            System.out.println(a + " " + sign + " " + b + " = " + (a + b));
        } else if (sign == '-'){
            System.out.println(a + " " + sign + " " + b + " = " + (a - b));
        } else if (sign == '/'){
            System.out.println(a + " " + sign + " " + b + " = " + (a / b));
        } else if (sign == '%'){
            System.out.println(a + " " + sign + " " + b + " = " + (a % b));
        } else if (sign == '^'){
            int mult = 1;
            for (int i = 1; i <=b; i++){
                mult *=a;
            }
            System.out.println(a + " " + sign + " " + b + " = " + mult);
        }
    }
}