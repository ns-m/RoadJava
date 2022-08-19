public class WrapperClassesOfPrimitiveDataTypesLs31 {

    public static void main(String[] args) {
        //Wrapper classes of primitive data types
        // Double, Float, Long, Integer, Short, Byte, Character, Boolean

        int x = 10;

        Integer y = new Integer(100); // it is wrong code
        int z = Integer.parseInt("555");
        System.out.println(z);

        Integer a = 200; //packed

        int b = a; //unpacked

    }
}
