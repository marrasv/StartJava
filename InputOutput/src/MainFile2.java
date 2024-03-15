import java.io.*;

public class MainFile2 {
    public static void main(String [] args){
        File file = new File("file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream inputStream = new FileInputStream(file)){
            long before = System.currentTimeMillis();
            byte[] array = new byte[8];
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0){
                result.append(new String(array,0,count));
                count = inputStream.read(array);
            }
            System.out.print(result);
            long after = System.currentTimeMillis();
            //System.out.println((after - before) + "ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//end psvm
}//end class
