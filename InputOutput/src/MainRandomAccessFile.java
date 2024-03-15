import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class MainRandomAccessFile {
    public static void main(String[] args) {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter page or stop: ");
        String numberStr = scanner.nextLine();
        int num = 0;
        while(!numberStr.equals("stop")){
            num = Integer.parseInt(numberStr);
            num = (num-1) * 3000;
            try (RandomAccessFile randomAccessFile = new RandomAccessFile(file,"r")){
                randomAccessFile.seek(num);
                byte[] array = new byte[3000];
                randomAccessFile.read(array);
                System.out.println(new String(array));
                System.out.println("Enter page or stop: ");
                numberStr = scanner.nextLine();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//psvm
}//class
