package SerializationLs45;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectLs45 {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            PersonLs45 person1 = (PersonLs45) objectInputStream.readObject();
            PersonLs45 person2 = (PersonLs45) objectInputStream.readObject();

            System.out.println(person1);
            System.out.println(person2);

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
