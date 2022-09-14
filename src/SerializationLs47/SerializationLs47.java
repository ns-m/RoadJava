package SerializationLs47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationLs47 {

    public static void main(String[] args) {

        /*PersonLs46 adam = new PersonLs46(100, "Adam");
        PersonLs46 eva = new PersonLs46(200, "Eva");*/

        PersonLs47[] people = {
                new PersonLs47(100, "Adam"),
                new PersonLs47(200, "Eva"),
                new PersonLs47(300, "Jesus")
        };

        PersonLs47[] otherPeople = {
                new PersonLs47(400, "Bob"),
                new PersonLs47(500, "Joe"),
                new PersonLs47(600, "Lee")
        };

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("peopleArr.bin"))) {

            //option 1
            objectOutputStream.writeInt(people.length);
            for (PersonLs47 person: people
                 ) {
                objectOutputStream.writeObject(person);
            }

            //option 2
            objectOutputStream.writeObject(otherPeople);

            //automatic close
            //objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
