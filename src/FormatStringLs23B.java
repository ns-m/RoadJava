public class FormatStringLs23B {
    public static void main(String[] args) {
        System.out.printf("PI %.2f it`s very important %s in %d", 3.14, "number", 2022);
        System.out.println();
        System.out.printf("Number %6d \n", 500);
        System.out.printf("Number %6d \n", 5);
        System.out.printf("Number %6d \n", 50000);
        System.out.printf("Number %6d \n", 5000000);
        System.out.println();
        System.out.printf("Number %-6d \n", 500);
        System.out.printf("Number %-6d \n", 5);
        System.out.printf("Number %-6d \n", 50000);
        System.out.printf("Number %-6d \n", 5000000);
        System.out.println();
        System.out.printf("Number %d \n", 500);
        System.out.printf("Number %d \n", 5);
        System.out.printf("Number %d \n", 50000);
        System.out.printf("Number %d \n", 5000000);
    }
}
