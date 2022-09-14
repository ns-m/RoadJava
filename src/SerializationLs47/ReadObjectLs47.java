package SerializationLs47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectLs47 {

    public static void main(String[] args) {

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("peopleArr.bin"))) {
            /*FileInputStream fileInputStream = new FileInputStream("peopleArr.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);*/

            int peopleCount = objectInputStream.readInt();
            PersonLs47[] people = new PersonLs47[peopleCount];

            for (int i = 0; i < peopleCount; i++){
                people[i] = (PersonLs47) objectInputStream.readObject();
            }

            System.out.println(Arrays.toString(people));

            System.out.println("----------");

            PersonLs47[] otherPeople = (PersonLs47[]) objectInputStream.readObject();

            System.out.println(Arrays.toString(otherPeople));

            //automatic close
            //objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
