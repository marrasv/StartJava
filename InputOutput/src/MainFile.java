import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainFile {
    public static void main(String[] args) {
        String path = "folder1/folder2/folder3";
        File directory = new File(path);
        List<File> files = new ArrayList<>();
        for (int i = 5; i < 10; i++) {
            files.add(new File(path + "/Aile" + i + ".txt"));
            files.add(new File(path + "/Bfile" + i + ".txt"));
            files.add(new File(path + "/Cfile" + i + ".txt"));
        }
        directory.mkdirs();
        for (File f : files) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        files.stream()
                .filter(file -> file.getName().startsWith("A"))
                .map(File::getAbsolutePath)
                .forEach(System.out::println);
//
//        File[] arrayFileA = directory.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().contains("A");
//            }
//        });
//        if (arrayFileA.length > 0) {
//            for (File f : arrayFileA) {
//                System.out.println(f.getAbsolutePath());
//            }
//        } else {
//            System.out.println("No file mit A");
//        }
//        System.out.println(arrayFileA.length);
    }
}
