public class ArraysStringls12 {
    public static void main(String[] args) {
        String[] arrString = new String[4];
        arrString[0] = "Step 0";
        arrString[1] = "Next step";
        arrString[2] = "Important step";
        arrString[3] = "End step";

        for (int i = 0; i < arrString.length; i++){
            System.out.println(arrString[i]);
        }

        System.out.println();

        for (String strValue: arrString
             ) {System.out.println(strValue);
        }

        int[] intArray = {11, 12, 13, 14, 15};
        int sumResult = 0;
        for (int val: intArray
             ) {
            sumResult += val;
        }
        System.out.println();

        System.out.println(sumResult);
    }
}
