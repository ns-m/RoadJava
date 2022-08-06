import java.util.Scanner;

public class SwitchLs10 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Scanner inputStrData = new Scanner(System.in);
        System.out.println("Input your age - ");
        int age = inputData.nextInt();
        switch (age){
            case 7:
                System.out.println("You are 7 age old");
                break;
            case 15:
                System.out.println("You are 15 age old");
                break;
            case 19:
                System.out.println("You are 19 age old");
                break;
            default:
                System.out.println("You are dead man");
        }

        System.out.println("Input spell, please - ");
        String mySpell = inputStrData.nextLine();
        switch (mySpell){
            case "a":
                System.out.println("You input first spell Alphabet");
                break;
            case "b":
                System.out.println("You input second spell Alphabet");
                break;
            default:
                System.out.println("WTF?");
        }
    }
}
