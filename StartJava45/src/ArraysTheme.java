// SrartJava Lesson 4
// @author Mariia Sviridenkova
// @version 29.01.2024

import java.util.Arrays;
public class ArraysTheme {
    public static void reversArray() {
        System.out.println("1.Реверс значений массива");
        System.out.printf("%23s", "Массив до реверса: " );
        int[] array1 = {1, 7, 4, 5, 2, 6, 3};
        System.out.println(Arrays.toString(array1));
        int a;
        for (int i = 0; i < array1.length/2; i++) {
            a = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = a;
        }
        System.out.printf("%23s", "Массив после реверса: ");
        System.out.println(Arrays.toString(array1) + "\n");
    }
    public static void multiplicationArray() {
        System.out.println("2.Произведение элементов массива");
        int[] array = new int[9];
        int multi = 1;
        for (int i = 0; i < 9; i++){
            array[i] = i + 1;
            System.out.print(array[i] + (i < 8 ? " * " : " = "));
            multi *= array[i];
        }
        System.out.println(multi);
    }
    public static void deleteElementArray() {
        System.out.println("\n3. Удаление элементов массива");
        float[] array = new float[15];
        for (int i = 0; i < 15; i++){
            array[i] = (float) java.lang.Math.random();
            System.out.printf("%.3f  ", array[i]);
            System.out.print((i+1)%8 ==0 ? "\n" : "");
        }
        System.out.println();
        float numMid = array[array.length/2];
        int sumNul = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > numMid) {
                array[i] = 0;
                sumNul++;
            }
            System.out.printf("%.3f  ", array[i]);
            System.out.print((i+1)%8 ==0 ? "\n" : "");
        }
        System.out.println("\nЧисло нулей = " + sumNul);
    }

    public static void alphaStair() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] array = new char[26];
        array[0] = 'A';
        for(int i = 1; i < array.length; i++){
            array[i] = (char)((int)(array[i-1]) + 1);
        }
        for (int i = 1; i <= array.length;i++){
            for (int j = 0; j < i; j++){
                System.out.print(array[array.length-1 - j]);
            }
            System.out.println();
        }

    }

    public static void fillArray() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] array = new int[30];
        int a;
        boolean isDoble;
        for (int i = 0; i < array.length; i++){
            isDoble = false;
            a = (int) ((java.lang.Math.random() * 40) + 60);
            for (int j = 0; j < i; j++) {
                if (array[j] == a) {
                    isDoble = true;
                    break;
                }
            }
            if (isDoble) {
                i--;
            }  else {
                 array[i] = a;
                 System.out.print(array[i] + (((i+1)%10 == 0)? "\n": " "));
            }
        }
        sortArray(array);
    }
    private static void sortArray(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length-1; i++){
            min = array[i];
            for (int j = i; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    index  = j;
                }
            }
            array[index] = array [i];
            array[i] = min;
            index = i;
            System.out.print(min + (((i+1)%10 == 0)? "\n": " "));
        }
        System.out.println(array[array.length-1]); // вывод последнего элемента
    }
    public static void main(String[] args) {
        reversArray();
        multiplicationArray();
        deleteElementArray();
        alphaStair();
        fillArray();
    }
}
