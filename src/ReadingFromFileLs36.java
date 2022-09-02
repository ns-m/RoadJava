import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFileLs36 {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        String path = "C:" + separator + "BackUp1C" + separator + "AndroidStudioProjects" + separator + "RoadJava" + separator + "src" + separator + "testdata.txt";

        File filedata = new File(path);

        Scanner scanner = new Scanner(filedata);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
