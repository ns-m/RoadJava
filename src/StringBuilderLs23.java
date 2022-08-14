public class StringBuilderLs23 {
    public static void main(String[] args) {
        String test = "test step";
        test.toUpperCase();
        //String is not a changeable data type, a new string is created.
        test = test.toUpperCase();
        System.out.println(test);

        String tsString1 = "New";
        String tsString2 = " step";
        String tsString3 = " ...!";
        String allStrings = tsString1 + tsString2 + tsString3;
        System.out.println(allStrings);
        //this option consumes a lot of RAM

        StringBuilder sB = new StringBuilder("New");
        System.out.println(sB.toString());
        System.out.println("");
        sB.append(" step");
        sB.append(" ...!");
        System.out.println(sB.toString());
        //kakaha code

        System.out.println("");

        StringBuilder sB2 = new StringBuilder("New2");
        sB2.append(" step2").append(" ...!!");
        System.out.println(sB2.toString());
        //normal code

    }
}
