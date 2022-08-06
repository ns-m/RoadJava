public class BreakContinueLs9 {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if (i==10){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("we are out of loop");
        for (int i2 = 0; i2 <= 13; i2++){
            if (i2 % 2 == 0){
                continue;
            }
            System.out.println("This is odd number " + i2);
        }
    }
}
