import java.util.Scanner;

public class ConsoleInputDataLs7 {
    public static void main(String[] args) {
        String myString = "Next step..."; //packages java.lang class import in advance
        Scanner myInput = new Scanner(System.in); //packages java.util class import manually
        System.out.println("Input your data - ");
        String myInputString = myInput.nextLine(); //end input line after push enter key
        System.out.println("Your input`s data - " + myInputString);
        System.out.println("----------------");
        System.out.println("Input your number - ");
        int inputIntData = myInput.nextInt();
        System.out.println("Your input number is - " + inputIntData);
    }
}
