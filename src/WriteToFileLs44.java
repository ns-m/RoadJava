import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFileLs44 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("writeDataFile.txt");

        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Step 1");
        printWriter.println("Step 2");

        printWriter.close();
    }
}
