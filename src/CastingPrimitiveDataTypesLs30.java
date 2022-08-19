public class CastingPrimitiveDataTypesLs30 {
    public static void main(String[] args) {
        int x = 100;
        long y = x; //implicit casting
        int z = (int)y; //explicit casting
        System.out.println(z);

        float a = (float)36.6; //explicit casting
        float b = 37.7f; //explicit casting

        int c = 200;
        double d = c; //implicit casting

        double e = 200.6;
        int f = (int)e; //explicit casting
        System.out.println(f);

        long g = Math.round(e);
        System.out.println(g);

        byte h = (byte)131; //byte: -128...127
        System.out.println(h);
    }
}
