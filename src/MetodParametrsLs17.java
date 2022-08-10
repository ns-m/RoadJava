import java.util.Scanner;

public class MetodParametrsLs17 {
    public static void main(String[] args) {

        ADLs17 adFirst = new ADLs17();
        Scanner inputData = new Scanner(System.in);
        adFirst.setAdNamePriceAdDescAd(inputData.nextLine(), inputData.nextLine(), inputData.nextInt());
        /*System.out.println("Input is an Ad name- ");
        adFirst.nameAd = inputData.nextLine();
        System.out.println("Input is an Ad price- ");
        adFirst.priceAd = inputData.nextInt();
        System.out.println("Input description- ");
        adFirst.descriptionAd = inputData.nextLine();*/
        /*adFirst.nameAd = "Cool motorbike";
        adFirst.priceAd = 700000;
        adFirst.descriptionAd = "Best motorbike of the world!";*/
        /*System.out.println("Ad category motors - " + adFirst.nameAd + ", " + "Price ad - " + adFirst.priceAd + ", " + "Description - " + adFirst.descriptionAd);*/
        /*System.out.println(adFirst.calculateExchangeRate(52.3f));*/
        adFirst.outputAdInfo();

        ADLs17 adSecond = new ADLs17();
        adSecond.nameAd = "Interesting book";
        adSecond.priceAd = 1500;
        adSecond.descriptionAd = "Superman`s adventures";
        /*System.out.println("Ad category books " + adSecond.nameAd + "Price ad - " + adSecond.priceAd + "Description - " + adSecond.descriptionAd);*/
        /*System.out.println(adSecond.calculateExchangeRate(55.5f));*/
        adSecond.outputAdInfo();
    }
}

class ADLs17{
    String nameAd;
    String descriptionAd;
    int priceAd;

    void outputAdInfo(){ //no returns data method
        System.out.println("Ad category motors - " + nameAd + ", " + "Price ad - " + priceAd + ", " + "Description - " + descriptionAd);
    }

    /*float calculateExchangeRate(float val){
        return priceAd / val;
    }*/

    void setAdNamePriceAdDescAd(String inputAdName, String inputDescAd, int inputPriceAd){
        nameAd = inputAdName;
        priceAd = inputPriceAd;
        descriptionAd = inputDescAd;
    }
}