package SerializationLs46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationLs46 {

    public static void main(String[] args) {

        /*PersonLs46 adam = new PersonLs46(100, "Adam");
        PersonLs46 eva = new PersonLs46(200, "Eva");*/

        PersonLs46[] people = {
                new PersonLs46(100, "Adam"),
                new PersonLs46(200, "Eva"),
                new PersonLs46(300, "Jesus")
        };

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("peopleArr.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeInt(people.length);
            for (PersonLs46 person: people
                 ) {
                objectOutputStream.writeObject(person);
            }

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
