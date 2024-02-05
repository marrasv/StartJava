import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*1. Имеется массив из четырёх чисел int[] numbers = {3, 9, 11, 15};. Поменяйте местами первый и второй элемент
         массива. (Ответ)
        2. Создайте массив из всех чётных чисел от 2 до 30 и выведите элементы массива на экран.
        3. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив
         выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
        4. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены
         последовательности равны единицам, а каждый следующий — сумме двух предыдущих.*/
        int[] numbers = {3, 9, 11, 15};
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]", ""));
        int a = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = a;
        System.out.println(Arrays.toString(numbers));

        int min = 2;
        int max = 30;
        int[]numbers2 = new int[(max - min)/2 +1];
        numbers2[0] = min;
        for (int i = 1; i < numbers2.length; i++){
            numbers2[i] = numbers2[i - 1] + 2;
        }
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = new int[50];
         numbers3[0] = 1;
        for (int i = 1; i < numbers3.length; i++) {
            numbers3[i] = numbers3[i - 1] + 2;
        }
        //System.out.println(Arrays.toString(numbers3).replaceAll("[\\[\\],]", ""));
        for (int cell : numbers3) System.out.print(cell + " ");
        System.out.println();
        for (int i = numbers3.length - 1; i >= 0; i--) System.out.print(numbers3[i] + " ");
    }
}
