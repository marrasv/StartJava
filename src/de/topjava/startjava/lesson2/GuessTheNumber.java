package de.topjava.startjava.lesson2;

//GuessTheNumber.java
public class GuessTheNumber{
    public static void main(String[] args){
        int number = 72; // number 0...100
        int maxN = 100;
        int minN = 0;
        int assumedNumber = 50;
        do {
            if (assumedNumber < number){
                System.out.printf ("Число %d меньше того, что загадал компьютер\n", assumedNumber);
                minN = assumedNumber;
                assumedNumber = (maxN - assumedNumber)/2 + minN;
            } else if (assumedNumber > number){
                System.out.printf ("Число %d больше того, что загадал компьютер\n", assumedNumber);
                maxN = assumedNumber;
                assumedNumber = maxN -(assumedNumber - minN)/2;
            }
        } while (!(number == assumedNumber));
        System.out.println("Верно. Компьютер загадал число " + assumedNumber); 
    }
}