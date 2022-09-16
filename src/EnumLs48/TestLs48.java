package EnumLs48;

public class TestLs48 {

    /*private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int COW = 2;*/

    public static void main(String[] args) {

        AnimalLs48 animal = AnimalLs48.DOG;

        switch (animal){
            case CAT:
                System.out.println("It`s a cat.");
                break;
            case DOG:
                System.out.println("It`s a dog");
                break;
            case COW:
                System.out.println("It`s a cow");
                break;
            default:
                System.out.println("It not an animal");
        }

        System.out.println(animal.getTranslation());
        System.out.println(animal);

        SeasonLs48 seasonLs48 = SeasonLs48.SPRING;
        System.out.println(seasonLs48.getTemp());
    }
}
