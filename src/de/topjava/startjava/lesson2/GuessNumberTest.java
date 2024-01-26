package de.topjava.startjava.lesson2;

import java.util.Scanner;
import java.lang.Math;

public class GuessNumberTest {
    public static void main (String[] args) {

        System.out.print("Введите имя первого игрока: ");
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Введите имя второго игрока: ");
        String name2 = console.nextLine();
        Player player2 = new Player(name2);

        int number;
        String answer;

        do {
            number = (int) (Math.random()*100);//число загадал компьютер
            GuessNumber game = new GuessNumber(player1, player2);
            game.guessStart(number);

            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = console.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));

        } while (answer.equals("yes"));
    }
}