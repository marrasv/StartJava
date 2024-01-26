package de.topjava.startjava.lesson2;

import de.topjava.startjava.lesson2.*;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessStart(int num){
            int number = num;
            int winner = 0;
            Scanner console = new Scanner (System.in);
            int number1;
            int number2;

        do {
            System.out.print("Игрок " + player1.getName() +", введите число: ");
            number1 = console.nextInt();

            if (number1 < number){
                System.out.printf ("Число %d меньше того, что загадал компьютер\n", number1);
            } else if (number1 > number){
                System.out.printf ("Число %d больше того, что загадал компьютер\n", number1);
            }else {
                winner = 1;
                break;
            }

            System.out.print("Игрок " + player2.getName() +", введите число: ");
            number2 = console.nextInt();

            if (number2 < number){
                System.out.printf ("Число %d меньше того, что загадал компьютер\n", number2);
            } else if (number2 > number){
                System.out.printf ("Число %d больше того, что загадал компьютер\n", number2);
            }else {
                winner = 2;
                break;
            }
        } while (winner == 0);

        System.out.println("Верно. Компьютер загадал число " + number); 
        switch (winner){
            case 1:
                System.out.println("Победитель игрок: " + player1.getName());
                break;
            case 2:
                System.out.println("Победитель игрок: " + player2.getName());
                break;
        }
    }
}