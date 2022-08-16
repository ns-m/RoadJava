public class InheritanceLs25 {

    public static void main(String[] args) {
        MammalsLs25 bull = new MammalsLs25();

        bull.eat();
        bull.sleep();

        System.out.println("----");

        DogLs25 bulldog = new DogLs25();

        bulldog.eat();
        bulldog.sleep();
        bulldog.barking();
        bulldog.wagging();

        bulldog.showNickname();
    }
}
