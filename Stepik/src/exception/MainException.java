package exception;

public class MainException {
    public static void main(String[] args) {
        String[] array = new String[5];
        try {
            System.out.println(array[array.length]);
        }catch (Exception e){
            System.out.println("Exception " + e.getClass());
        }
    }
}
