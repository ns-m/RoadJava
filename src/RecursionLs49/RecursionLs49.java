package RecursionLs49;

public class RecursionLs49 {

    public static void main(String[] args) {

        //someMethod(); StackOverflowError
        counter(7);
    }

    //StackOverflowError
    private static void someMethod(){

        System.out.println("Next step...");
        someMethod();
    }

    private static void counter(int x){

        System.out.println(x);

        counter(x--);
    }
}
