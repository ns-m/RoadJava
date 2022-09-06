import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsLs37 {
    public static void main(String[] args) {

        //File file = new File("testPath");
        /*File file = new File("testPathFile.txt");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After function Scanner");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found!");
        }
        System.out.println("After try/catch block.");*/

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Method MAIN!");
        }
    }

    public static void readFile() throws FileNotFoundException {

        File file = new File("testPathFile");
        Scanner scanner = new Scanner(file);
    }
}
