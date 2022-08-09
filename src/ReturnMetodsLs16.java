public class ReturnMetodsLs16 {
    public static void main(String[] args) {

        ADLs16 adFirst = new ADLs16();
        adFirst.nameAd = "Cool motorbike";
        adFirst.priceAd = 700000;
        adFirst.descriptionAd = "Best motorbike of the world!";
        /*System.out.println("Ad category motors - " + adFirst.nameAd + ", " + "Price ad - " + adFirst.priceAd + ", " + "Description - " + adFirst.descriptionAd);*/
        adFirst.outputAdInfo();
        System.out.println(adFirst.calculateExchangeRate(52.3f));

        ADLs16 adSecond = new ADLs16();
        adSecond.nameAd = "Interesting book";
        adSecond.priceAd = 1500;
        adSecond.descriptionAd = "Superman`s adventures";
        /*System.out.println("Ad category books " + adSecond.nameAd + "Price ad - " + adSecond.priceAd + "Description - " + adSecond.descriptionAd);*/
        adSecond.outputAdInfo();
        System.out.println(adSecond.calculateExchangeRate(55.5f));
    }
}

class ADLs16{
    String nameAd;
    int priceAd;
    String descriptionAd;

    void outputAdInfo(){ //no returns data method
        System.out.println("Ad category motors - " + nameAd + ", " + "Price ad - " + priceAd + ", " + "Description - " + descriptionAd);
    }

    float calculateExchangeRate(float val){
        return priceAd / val;
    }
}