import java.util.Scanner;
import java.lang.Math;

public class GuessNumberTest {
    public static void main (String[] args) {

        System.out.print("Введите имя первого игрока: ");
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = console.nextLine();

        int number;
        String answer;
        GuessNumber game = new GuessNumber(name1, name2);
        do {
            number = (int) (Math.random()*100);//число загадал компьютер
            //GuessNumber game = new GuessNumber(name1, name2);
            game.guessStart(number);

            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = console.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));

        } while (answer.equals("yes"));
    }
}
