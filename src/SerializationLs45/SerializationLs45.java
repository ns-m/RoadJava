package SerializationLs45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationLs45 {

    public static void main(String[] args) {

        PersonLs45 adam = new PersonLs45(100, "Adam");
        PersonLs45 eva = new PersonLs45(200, "Eva");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
