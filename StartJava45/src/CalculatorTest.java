import java.util.Scanner;

public class CalculatorTest {
    public static void main (String[] args) {
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            Scanner s1 = new Scanner(System.in);
            String mathExpression = s1.nextLine();
            Calculator.Calc(mathExpression);
            do{
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = s1.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}