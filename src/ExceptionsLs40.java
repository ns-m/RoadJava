import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionsLs40 {

    public static void main(String[] args) {

        try {
            test();
        } /*catch (IOException | ParseException e) {
            e.printStackTrace();
        }*/ catch (Exception e){
            System.out.println("Exception!");
        }
    }

    public static void test() throws IOException, FileNotFoundException, ParseException {

    }
}
