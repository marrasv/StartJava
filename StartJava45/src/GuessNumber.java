import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {

    public Player player1;
    public Player player2;



    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void guessStart(int num){
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPT_MAX + " попыток.");
        //int number = num; // число загаданное компьютером
        int winner = 0; // номер выигрывшего игрока
        Scanner console = new Scanner (System.in);
        int number1;
        int number2;

        do {
            System.out.print("Игрок " + player1.getName() +", введите число: ");
            number1 = console.nextInt();
            player1.arrayOfNumbers[player1.sumAttempt] = number1;
            player1.sumAttempt ++;
            if (number1 < num){
                System.out.printf ("Число %d меньше того, что загадал компьютер\n", number1);
            } else if (number1 > num){
                System.out.printf ("Число %d больше того, что загадал компьютер\n", number1);
            }else {
                winner = 1;
                break;
            }

            System.out.print("Игрок " + player2.getName() +", введите число: ");
            number2 = console.nextInt();
            player2.arrayOfNumbers[player2.sumAttempt] = number2;
            player2.sumAttempt ++;
            if (number2 < num){
                System.out.printf ("Число %d меньше того, что загадал компьютер\n", number2);
            } else if (number2 > num){
                System.out.printf ("Число %d больше того, что загадал компьютер\n", number2);
            }else {
                winner = 2;
                break;
            }
        } while ((winner == 0)&&(player1.sumAttempt != 10));

        System.out.println("Компьютер загадал число " + num);

        switch (winner){
            case 0:
                System.out.println("У игроков закончились попытки");
                break;
            case 1:
                System.out.println("Игрок " + player1.getName() + " угадал " + num + " с " + player1.sumAttempt + " попытки");
                                break;
            case 2:
                System.out.println("Игрок " + player2.getName() + " угадал " + num + " с " + player2.sumAttempt + " попытки");
                break;
        }
        System.out.printf((Arrays.toString(Arrays.copyOf(player1.arrayOfNumbers, player1.sumAttempt))).replaceAll("[\\,\\[\\]]", ""));
        System.out.println();
        System.out.printf((Arrays.toString(Arrays.copyOf(player2.arrayOfNumbers, player2.sumAttempt))).replaceAll("[\\,\\[\\]]", ""));
        System.out.println();
        Arrays.fill(player1.arrayOfNumbers,0,player1.sumAttempt,0);
        Arrays.fill(player2.arrayOfNumbers,0,player2.sumAttempt,0);
        player1.sumAttempt = 0;
        player2.sumAttempt = 0;
    }
}
