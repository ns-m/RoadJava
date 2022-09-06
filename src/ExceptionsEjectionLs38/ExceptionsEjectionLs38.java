package ExceptionsEjectionLs38;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsEjectionLs38 {

    public static void main(String[] args) throws IOException, ScannerExceptionsLs38 {

        Scanner scanner = new Scanner(System.in);

        while (true){

            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                //throw new IOException();
                throw new ScannerExceptionsLs38("The user did not enter zero.");
            }
        }
    }
}
