import java.util.List;
import java.util.ArrayList;

public class GenericsLs33 {

    public static void main(String[] args) {
        ////// old style java 5/////
        List people = new ArrayList();
        people.add("adam");
        people.add("eva");
        people.add("bob");

        String person = (String) people.get(1); //use downcasting
        System.out.println(person);

        /////// new method Generics///////
        List<String> otherPeople = new ArrayList<String>();
        otherPeople.add("lee");
        otherPeople.add("bruce");
        otherPeople.add("superman");

        String otherPerson = otherPeople.get(2);
        System.out.println(otherPerson);

        ////// since Java 7///////
        List<String> italians = new ArrayList<>();

    }
}
