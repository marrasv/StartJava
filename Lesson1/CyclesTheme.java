public class CyclesTheme{
    public static void main(String[] args) {

/*Подсчет суммы четных и нечетных чисел
подсчитайте с помощью do-while сумму четных и нечетных чисел в отрезке [-10, 21]
отобразите эти значения в формате:
В отрезке [-10, 21] сумма четных чисел = X, а нечетных = Y

при этом для вывода чисел из [-10, 21] используйте значения переменных, а не сами числа
*/
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int finish = 21;
        int x = 0;
        int y = 0;
        int i = start;
        do {
            if (i%2 == 0){
                x++;
            } else {
                y++;
            } 
            i++;
        } while (i <=finish);
        System.out.println ("x = " + x + " y = " + y + "\n");

/*Вывод чисел в порядке убывания
среди значений 10, 5, -1 найдите max и min число
отобразите в одну строку в порядке убывания все числа в интервале (min, max) 
для вывода чисел используйте for
обратите внимание, что интервал — математический (не путайте его с отрезком)
использовать методы max и min класса Math — нельзя*/
        System.out.println("2. Вывод чисел в порядке убывания");
        int[] numbers = {10, 5,-1};
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers){
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        System.out.println(max + " " + min + "\n");

/*Вывод реверсивного числа и суммы его цифр
из числа 1234 выделите каждую цифру, используя while
подсчитайте сумму полученных цифр
отобразите в консоли:
исходное число в обратном порядке (при этом формировать число целиком, чтобы вывести, не нужно)
сумму его цифр
*/
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0){
            sum +=num%10;
            System.out.print((num%10) + " ");
            num /=10;
        }
        System.out.println("sum = " + sum + "\n");

/*Вывод чисел в несколько строк
выведите с помощью for нечетные числа в полуинтервале [1, 24)
отображайте в каждой строке по 5 чисел
отделяйте их друг от друга необходимым количеством пробелов
не указывайте впереди числа нули
недостающее в последней строке до 5 количество чисел заполните нулями
число нулей определяйте программно. Не считайте их в уме и не пишите сами
выравнивайте числа в каждом столбце по правому краю, используя форматированный вывод с помощью printf (1, 2)
для себя проверьте, правильно ли работает программа для полуинтервала [1, 30). В последней строке не должны отображаться одни нули
*/
        System.out.println("4. Вывод чисел в несколько строк");
        int st = 1;
        int fin = 24;
        for (i = st; i<= ((fin/5)*5 + 5); i++){
            if (i< fin) {
                System.out.printf ("%5d",(st));
            } else {
                System.out.printf ("%5d",0);
            }
            if (i%5 == 0){
                System.out.println("");
            }
            st++;
        }
        System.out.println("");

/*Проверка количества двоек числа на четность/нечетность
подсчитайте с помощью while количество входящих в 3242592 двоек
проверьте получившееся значение на четность/нечетность
отобразите результат в следующем формате:
В 3242592 нечетное количество двоек — 3

*/
        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int num1 = 32425922;
        int sum2 = 0;
        System.out.print("В " + num1);
        do{
            if (num1%10 ==2){
                sum2++;
            }
            num1 /= 10;
        } while (num1 > 0);
        if (sum2%2 == 0){
            System.out.print(" четное количество двоек - " + sum2);
        } else {
            System.out.print(" нечетное количество двоек - " + sum2);
        }
        System.out.println("\n");

/*Отображение геометрических фигур
отобразите геометрические фигуры, используя:
для прямоугольника только for
для прямоугольного треугольника только while
для второго треугольника только do-while (для его отображения достаточно двух циклов, а не четырех)
фигуры отображайте друг под другом (не как в образце)
**********    #####    $
**********    ####     $$
**********    ###      $$$ 
**********    ##       $$
**********    #        $
Отделяйте пустой строкой код одной фигуры от другой, чтобы он не сливался
*/
        System.out.println("6. Отображение геометрических фигур");

        for (i = 1; i <=50; i++){
            System.out.print("*");
            if (i%10==0){
                System.out.println();
            }
        }

        int k = 5;
        String str = "#";
        while (k > 0){
            System.out.println(str.repeat(k));
            k--;
        }

        k = 1;
        String str3 = "$";
        do {
            System.out.println(str3.repeat( Math.abs((2*(k/4)-(k%4) ) )));
            k++;
        } while (k < 6);
        System.out.println("\n");

/*Отображение ASCII-символов
отобразите, используя for, данные столбцов DECIMAL, CHARACTER и DESCRIPTION (включая их названия) 
из таблицы
для вывода значений последнего столбца используйте метод Character.getName()
выведите в консоль:
символы, идущие до цифр и имеющие нечетные коды, начиная с кода 15
маленькие английские буквы, имеющие четные коды
данные столбцов выровняйте по центру их названий. А в DESCRIPTION — еще и по левому краю
*/
        System.out.println("7. Отображение ASCII-символов");
        System.out.println ("DECIMAl HEX CHARACTER DESCRIPTION");
        for (i = 15; i<49; i++){
            if (i%2==1){
                System.out.printf("%4d ",i);
                System.out.printf("%5s ",(Integer.toHexString(i)));
                System.out.printf("%5s",((char) i));
                System.out.printf ("      ");
                System.out.println((Character.getName(i)) );
            }

        }
         System.out.println("\n");
/*Проверка, является ли число палиндромом
проверьте, является ли 1234321 палиндромом (читается одинаково с любой стороны)
использовать Math.pow нельзя
отобразите результат в следующем формате:
число N является (не является) палиндромом
*/
        System.out.println("8. Проверка, является ли число палиндромом");
        int num2 = 12343212;
        boolean isPalindrom = true;
        String strNum2 = Integer.toString(num2);
        int len = strNum2.length();
        char char1;
        char char2;
        for (i = 0; i<(len); i++){
            char1 = strNum2.charAt(i);
            char2 = strNum2.charAt(len-1-i);
            if (!(char1 == char2)){
                isPalindrom = false;
                break;
            } 
        }
        System.out.println(num2 + " палиндром? " + isPalindrom);
        System.out.println("\n");

/*Проверка, является ли число счастливым
счастливым называется число, сумма первых трех цифр которого равна сумме последних
возьмите любое шестизначное число
подсчитайте сумму каждой его половины
отобразите результат в следующем формате:
Число ABCDEF является (не является) счастливым
Сумма цифр ABC = S1, а сумма DEF = S2*/
        System.out.println("9. Проверка, является ли число счастливым");
        int num6 = 123123;
        num1 = num6/1000;
        num2 = num6%1000;
        int s1;
        int s2;
        System.out.printf("Число %d ",num6);
        s1 = num1/100 + num1/10 + num1%10;
        s2 = num2/100 + num2/10 + num2%10;
        if (s1 == s2){
            System.out.println("является счастливым\n");
        } else {
            System.out.println("не является счастливым\n");
        }
/*Отображение таблицы умножения Пифагора
с помощью for отобразите таблицу умножения в точности, как в образце (включая горизонтальные и вертикальные линии. Их можно отображать прерывистыми)
*/
        System.out.println("10. Отображение таблицы умножения Пифагора");
        System.out.print("   |");
        for (i = 2; i < 10; i++){
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (i = 1; i < 11; i++){
            System.out.printf("---");
        }
        System.out.println();
        for (i = 2; i < 10; i++){
            System.out.printf(" %1d |", i);
            for (int j = 2; j < 10; j++){
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }
}