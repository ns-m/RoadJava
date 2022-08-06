import java.util.Scanner;

public class DoWhileLs8 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        /*System.out.println("Input number - ");
        int myValue = inputNumber.nextInt();
        while (myValue != 5){
            if (myValue < 5){
                System.out.println("Input bigger number - ");
                myValue = inputNumber.nextInt();
            } else if (myValue > 5) {
                System.out.println("Input smaller number - ");
                myValue = inputNumber.nextInt();
            }
        }
        System.out.println("Bingo!!!");*/
        int myValue = inputNumber.nextInt();  //visibility area is important
        do {
            if (myValue < 5){
                System.out.println("Input bigger number - ");
                myValue = inputNumber.nextInt();
            } else if (myValue > 5) {
                System.out.println("Input smaller number - ");
                myValue = inputNumber.nextInt();
            }
        }while (myValue!=5); System.out.println("Bingo!!!");
    }
}
