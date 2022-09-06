import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsCheckedUncheckedLs39 {
    public static void main(String[] args) {
        //Checked Exception (Compile time Exception) - handling exceptional situations
        File file = new File("wrongPath");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Unchecked Exception (Runtime Exception) - mistakes
        int x = 1 / 0;
        int[] arrInt = new int[2];
        System.out.println(arrInt[2]);
    }
}
