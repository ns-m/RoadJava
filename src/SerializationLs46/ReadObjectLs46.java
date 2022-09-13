package SerializationLs46;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectLs46 {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("peopleArr.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            int peopleCount = objectInputStream.readInt();
            PersonLs46[] people = new PersonLs46[peopleCount];

            for (int i = 0; i < peopleCount; i++){
                people[i] = (PersonLs46) objectInputStream.readObject();
            }

            System.out.println(Arrays.toString(people));

            System.out.println("----------");

            PersonLs46[] otherPeople = (PersonLs46[]) objectInputStream.readObject();

            System.out.println(Arrays.toString(otherPeople));

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
