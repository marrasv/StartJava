package de.topjava.startjava.lesson1;

public class IfElseStatementTheme{
    public static void main(String[] args){

/*Перевод псевдокода на язык Java (это название задачи)
перепишите псевдокод, приведенный ниже, с помощью Java
используйте переменные, условные операторы, логическое НЕ
придумайте сообщения для отображения их в консоли
ЕСЛИ(!мужскойПол) {
    сообщение
} ИНАЧЕ {
    сообщение
}

ЕСЛИ(возраст > 18) {
    сообщение
} ИНАЧЕ {
    сообщение
}

ЕСЛИ(рост < 1.8) {
    сообщение
} ИНАЧЕ {
    сообщение
}


перваяБукваИмени = "Имя".charAt(0);
ЕСЛИ(перваяБукваИмени == 'M') {
    сообщение
} ИНАЧЕ ЕСЛИ(перваяБукваИмени == 'I') {
    сообщение
} ИНАЧЕ {
    сообщение
}*/
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMan = false;
        byte age = 43;
        float height = 1.7f;
        char firstLetter = 'M';
        if (!isMan){
            System.out.println("Вы женщина");
        } else{
            System.out.println("Вы мужчина");
        }
        if (age > 18){
            System.out.println("Вы взрослый");
        } else{
            System.out.println("Вы ребёнок");
        }
        if (height < 1.8){
            System.out.println("Вы среднего роста");
        } else{
            System.out.println("Вы высокого роста");
        }
        if (firstLetter == 'M'){
            System.out.println("Имя на М\n");
        } else if (firstLetter == 'I'){
            System.out.println("Имя на I\n");
        } else {
            System.out.println("Интересное имя\n");
        }
/*Поиск большего числа
двум переменным присвойте любые целые числа
найдите, какое из значений больше другого
выведите в консоль:
числа, указав какое из них больше другого
информацию об их равенстве, если они равны
для себя проверьте, правильно ли работает программа, если значения переменных поменять местами, 
а также при их равенстве*/
        System.out.println("2. Поиск большего числа");
        int a = 12;
        int b = 32;
        System.out.println("a = " + a + " b = " + b);
        if (a > b){
            System.out.println("a больше b\n");
        } else if (b > a){
            System.out.println("b больше a\n");
        } else{
            System.out.println("b равно a" + "\n");
        }
/*Проверка числа
присвойте переменной любое целое число
определите, являться ли оно:
нулем
четным (нечетным)
отрицательным (положительным)
ограничения:
если число равно 0, то данная программа должна отобразить соответствующее сообщение и сразу завершиться
остальные проверки реализуйте во вложенных if-else
не используйте return
если число != 0, то не нужно выводить эту информацию
проверки и части выводимого текста не должны дублироваться
отобразите результат в следующем формате:
-10 является отрицательным и четным*/
        System.out.println("3. Проверка числа");
        a = -40;
        System.out.print(a);
        if (a == 0){
            System.out.println(" равно 0");
        } else{
            System.out.print(" является ");
            if (a < 0){
                System.out.print("отрицательным ");
            } else{
                System.out.print("положительным ");
            }
            if (a%2 == 0){
                System.out.println("и чётным\n");
            } else{
                System.out.println("и нечётным\n");
            }
        }
        /*Поиск одинаковых цифр в числах
двум переменным присвойте любые целые трехзначные числа
если у чисел есть одинаковые цифры, стоящие в одном и том же разряде, отобразите в консоль:
исходные числа
одинаковые в них цифры
номера разрядов
если равных цифр нет, то отобразите один раз соответствующее сообщение
если все цифры в разрядах разные, то поразрядная проверка выполняться уже не должна
для себя проверьте, правильно ли работает программа для чисел 123 и 223*/
        System.out.println("4. Поиск одинаковых цифр в числах");
        a = 123;
        b = 223;
        int a1 = a % 10;
        int a10 = a / 10 % 10;
        int a100 = a / 100;
        int b1 = b % 10;
        int b10 = b / 10 % 10;
        int b100 = b / 100;
        if ((a1 == b1)||(a10 == b10)||(a100 == b100)){
            System.out.println("a = " + a + " b = " + b);
            if (a1 == b1){
                System.out.println("Цифра " + a1 + " в разряде единиц");
            }
            if (a10 == b10){
                System.out.println("Цифра " + a10 + " в разряде десятков");
            }
            if (a100 == b100){
                System.out.println("Цифра " + a100 + " в разряде сотен");
            }
        } else{
            System.out.println("Все цифры в разрядах разные");
        }
        System.out.println();
/*Определение символа по его коду
присвойте переменной типа char код '\u0057'
программа должна определить — это буква, цифра или другой символ. Используйте таблицу символов
в if используйте символы, а не их коды
использовать методы классов Java запрещено
выведите в консоль сам символ и информацию о нем:
маленькая буква
большая буква
цифра
не буква и не цифра
формат вывода следующий:
Символ Такой-то является большой буквой

для себя проверьте, правильно ли работает программа для кода '\u005E' и '\u0031'*/
        System.out.println("5. Определение символа по его коду");
        //char ch = (char) 0x0057;
        //char ch = (char) 0x005E;
        //char ch = (char) 0x0031;
        char ch = 's';
        System.out.println(ch);
        if ((ch >= 'a') && (ch <= 'z')){
            System.out.println("маленькая буква");
        } else if ((ch >= 'A') && (ch <= 'Z')){
            System.out.println("большая буква");
        } else if ((ch >= '0') && (ch <= '9')){
            System.out.println("цифра");
        } else {
            System.out.println("Не известно");
        }
        System.out.println();
/*Подсчет суммы вклада и начисленных банком %
сумма вклада равна 301 000 руб.
если она:
меньше 100 000, то банк начисляет 5% годовых
от 100 000 до 300 000, то — 7%
больше 300 000, то — 10%
отобразите в консоли:
сумму вклада
сумму начисленного % (не путайте с процентной ставкой)
итоговую сумму с %
*/
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int sumVklad = 301000;
        int stavka = 10;
        if (sumVklad< 100000){
            stavka = 5;
        } else if (sumVklad<300000){
            stavka = 7;
        }
        System.out.println("Сумма вклада " + sumVklad);
        System.out.println("Сумма начисленного " + (sumVklad*stavka/100));
        System.out.println("Итоговая сумма " + (sumVklad + sumVklad*stavka/100));
        System.out.println();
/*Определение оценки по предметам
студент получил итоговые % по предметам:
история 59%
программирование 92%
определите оценки по каждому предмету:
<= 60% — 2
> 60% — 3
> 73% — 4
> 91% — 5
выведите в консоль:
предмет и напротив оценку
средний балл оценок по предметам
средний % по предметам
*/
        System.out.println("7. Определение оценки по предметам");
        byte history = 59;
        byte programm = 92;
        byte markH = 0;
        byte markP = 0;
        System.out.print("Оценка по истории ");
        if (history<=60){
            markH = 2;
        } else if (history<=73){
            markH = 3;
        } else if (history<=91){
            markH = 4;
        } else {
            markH = 5;
        }
        System.out.println(markH);
        System.out.print("Оценка по программированию ");
        if (programm<=60){
            markP = 2;
        } else if (programm<=73){
            markP = 3;
        } else if (programm<=91){
            markP = 4;
        } else {
            markP = 5;
        }
        System.out.println(markP);
        System.out.println("средний балл оценок по предметам " + ((markH + markP)/2));
        System.out.println("средний % по предметам " + ((history + programm)/2));
        System.out.println();
/*Расчет годовой прибыли
подсчитайте годовую прибыль:
ежемесячно товар продается на 13 000 руб.
аренда помещения — 5 000 руб./месяц
себестоимость производства — 9 000 руб./месяц


формат вывода на консоль следующий:
Прибыль за год: -1 000 руб.
или
Прибыль за год: +3 000 руб.

если прибыль положительная, то рядом с числом необходимо отображать +
при этом +0 быть не должно
*/
        System.out.println("8. Расчет годовой прибыли");
        int sumInMonth = 14000;
        int arenda = 5000;
        int costPrice = 9000;
        int profitInMonth;
        profitInMonth = sumInMonth - arenda - costPrice;
        System.out.print("Прибыль за год: ");
        if (profitInMonth > 0){
            System.out.print("+" + (12*profitInMonth));
        } else if (profitInMonth == 0){
            System.out.print("0 ");
        } else {
            System.out.print((12*profitInMonth));
        }
        System.out.print(" руб.");
    }
}