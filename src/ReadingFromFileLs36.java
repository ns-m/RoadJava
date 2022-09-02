import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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

        String path2 = "C:" + separator + "BackUp1C" + separator + "AndroidStudioProjects" + separator + "RoadJava" + separator + "src" + separator + "testdata2.txt";
        File filedata2 = new File(path2);
        Scanner scanner2 = new Scanner(filedata2);
        int counter = 0;

        String lineData = scanner2.nextLine();
        String[] strNumbers = lineData.split(" ");
        int[] numbers = new int[3];

        for (String number: strNumbers
             ) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner2.close();

        File filedata3 = new File("testPathFile.txt");
        Scanner scanner3 = new Scanner(filedata3);
        String lineData2 = scanner3.nextLine();
        System.out.println(lineData2);
    }
}
