import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello world !");
        System.out.println("2 + 9 = 11");

        String s = "E:\\Java_4_Module\\module_4_10";
        File file = new File(s, "readme.md");
        if (!file.exists()) {
            file.createNewFile();
        }

    }
}