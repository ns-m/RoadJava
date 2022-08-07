public class ArraysLs11 {
    public static void main(String[] args) {
        int myNumber = 10; //primitive data types [10]
        System.out.println(myNumber);

        int[] arrNumbers = new int[5]; //arrNumbers -> [arrays] Link to data
        for (int i = 0; i < arrNumbers.length; i++){
            arrNumbers[i] = i * 4;
        }
        for (int i = 0; i < arrNumbers.length; i++){
            System.out.println(arrNumbers[i]);
        }
        System.out.println();

        int[] arrNumbers2 = {2, 4, 8, 16, 32, 64};
        for (int i = 0; i < arrNumbers2.length; i++){
            System.out.println(arrNumbers2[i]);
        }
    }
}
