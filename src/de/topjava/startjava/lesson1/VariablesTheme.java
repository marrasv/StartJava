package de.topjava.startjava.lesson1;

public class VariablesTheme{
    public static void main(String[] args){

/*Вывод характеристик компьютера (это название задачи)
объявите переменные всех существующих в Java примитивных типов данных, присвоив им 
значенияи т. д. выведите в консоль:
значения этих переменных
описание характеристик        */
        System.out.println("1. Вывод характеристик компьютера");
        byte numCores = 6;
        short numShort = 1234;
        int virtualMemoryMax = 16253; //Mb
        long numLong = 1234567890;
        float basedSpeed = 2.38f; //Ghz
        double memory = 7.549d; //Mb
        char namePC = 'M';
        boolean isVirtualisation = true; 
        //вывод значений
        System.out.println("Число ядер = " + numCores);
        System.out.println("Число короткое = " + numShort);
        System.out.println("Максимальный размер виртуальной памяти = " + virtualMemoryMax + "Mb");
        System.out.println("Число длинное = " + numLong);
        System.out.println("Частота процессора = " + basedSpeed);
        System.out.println("Память = " + memory);
        System.out.println("Первая буква в имени компьютера = " + namePC);
        System.out.println("Виртуализация = " + isVirtualisation +"\n");

/*Расчет стоимости товара со скидкой
ручка стоит 100 руб., а книга — 200 руб.
вместе на них действует скидка 11%
выведите в консоль:
общую стоимость товаров без скидки
сумму скидки
общую стоимость товаров со скидкой
*/
        System.out.println("2. Расчет стоимости товара со скидкой");
        short costPen = 100;
        short costBook = 200;
        System.out.println("Общая стоимость без скидки = " + (costPen + costBook));
        System.out.println("Общая стоимость со скидкой 11% = " + (costPen + costBook)*0.89 + "\n");

/*Вывод слова JAVA
Отобразите без использования переменных в консоли слово JAVA:
   J    a  v     v  a                                                  
   J   a a  v   v  a a                                                 
J  J  aaaaa  V V  aaaaa                                                
 JJ  a     a  V  a     a
*/
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a" + "\n");

/*Вывод min и max значений целых числовых типов
создайте переменные всех целых числовых типов
присвойте им самые большие числа, которые они могут хранить
выводите данные в консоль для каждой переменной в следующей последовательности:
первоначальное значение
значение после инкремента на единицу
значение после декремента на единицу
не смешивайте вывод разных типов
*/
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = (int) Math.pow(2, 31);
        long longMax = (long) Math.pow(2, 63);
        System.out.println("Числовой тип byte: " + byteMax + " " + (byteMax++) + " " 
                + (byteMax--));
        System.out.println("Числовой тип short: " + shortMax + " " + (shortMax+1) + " " 
                + (shortMax-1));
        System.out.println("Числовой тип int: " + intMax + " " + (intMax+1) + " " 
                + (intMax-1));
        System.out.println("Числовой тип long: " + longMax + " " + (longMax++) + " " 
                + (longMax--) + "\n");

/*Перестановка значений переменных
создайте две переменные типа int, присвоив им 2 и 5
поменяйте их значения местами следующими способами:
с помощью третьей переменной
с помощью арифметических операций
с помощью побитовой операции ^
перед началом очередных перестановок присваивать переменным исходные значения не нужно
решение должно быть универсальным, а не привязано к конкретным значениям
выведите в консоль:
название способа перестановки значений
исходные значения переменных
новые значения переменных
*/
        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Способ 1. С помощью третьей переменной");
        System.out.println("Исходные значения: a = " + a + " b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новые значения: a = " + a + " b = " + b);

        System.out.println("Способ 2. С помощью арифметических операций");
        System.out.println("Исходные значения: a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новые значения: a = " + a + " b = " + b);

        System.out.println("Способ 3. С помощью побитовой операции ^");
        System.out.println("Исходные значения: a = " + a + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения: a = " + a + " b = " + b + "\n");

/*Вывод символов и их кодов
проинициализируйте переменные типа char символами (а не их кодами), найдя их в ASCII-таблице по 
кодам: 36, 42, 64, 124, 126
выведите в консоль в столбец попарно:
код символа 
соответствующий коду символ
код символа берите из переменной, а не пишите его руками
*/
        System.out.println("6. Вывод символов и их кодов");
        char char1 = (char) 36;
        char char2 = (char) 42;
        char char3 = (char) 64;
        char char4 = (char) 124;
        char char5 = (char) 126;
        System.out.println((int) char1 + " " + char1);
        System.out.println((int) char2 + " " + char2);
        System.out.println((int) char3 + " " + char3);
        System.out.println((int) char4 + " " + char4);
        System.out.println((int) char5 + " " + char5 + "\n");

/*Вывод в консоль ASCII-арт Дюка
отобразите с помощью переменных в консоли Java-талисман:
    /\                                                                                                                                       
   /  \                                                                                                                                      
  /_( )\                                                                                                                                     
 /      \                                                                                                                                    
/____/\__\
каждый уникальный символ Дюка (а не его код) храните в отдельной переменной (кроме пробелов)
*/
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char ch1 = '/';
        String ch2 = "\\";
        char ch3 = '_';
        char ch4 = '(';
        char ch5 = ')';
        System.out.println("    " + ch1 + ch2);
        System.out.println("   " + ch1 + "  " + ch2);
        System.out.println("  " + ch1 + ch3 + ch4 + " " + ch5 + ch2);
        System.out.println(" " + ch1 + "      " + ch2);
        System.out.println("" + ch1 + ch3 + ch3 + ch3 + ch3 + ch1 + ch2 + ch3 + ch3 + ch2 + "\n");

/*Вывод количества сотен, десятков и единиц числа из числа 123 выделите сотни, десятки и единицы
выделяйте каждую цифру числа программно, а не написав их самостоятельно
используйте для этого только операции / и %
не используйте цикл
найдите произведение и сумму выделенных цифр
выведите результат в формате:
Число N содержит:
  сотен - X
  десятков - Y
  единиц - Z 
Сумма его цифр = S
Произведение = P*/
        System.out.println("8. Вывод количества сотен, десятков и единиц числа из числа 123");
        int n = 123;
        int x = (n/100);
        int y = (n%100/10);
        int z = n - x*100 - y*10;
        System.out.println("Число " + n + " содержит:");
        System.out.println("  сотен - " + x);
        System.out.println("  десятков - " + y);
        System.out.println("  единиц - " + z);
        System.out.println("Сумма его цифр = " + (x + y + z));
        System.out.println("Произведение его цифр = " + (x * y * z)+ "\n");

/*Вывод времени
имеется 86399 секунд
переведите число в часы, минуты и секунды
используйте для этого только операции / и %
выведите в консоль значения в формате ЧЧ:ММ:СС*/
        System.out.println("9. Вывод времени");
        int numTime = 86399;
        a = (numTime - (numTime-numTime%60)/60%60*60 - numTime%60)/3600;
        System.out.println(a+ ":" + (numTime-numTime%60)/60%60 + ":" + numTime%60);
    }
}