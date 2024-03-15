public class MainWorker {
    public static void main(String[] args) {
        Director director = new Director();
        String result = director.force((int n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Working..." + i);
            }
            return "Success";
        },5);
        System.out.println(result);
    }
}
