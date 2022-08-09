public class MetodParametrsLs17 {
    public static void main(String[] args) {

        ADLs17 adFirst = new ADLs17();
        adFirst.nameAd = "Cool motorbike";
        adFirst.priceAd = 700000;
        adFirst.descriptionAd = "Best motorbike of the world!";
        /*System.out.println("Ad category motors - " + adFirst.nameAd + ", " + "Price ad - " + adFirst.priceAd + ", " + "Description - " + adFirst.descriptionAd);*/
        adFirst.outputAdInfo();
        System.out.println(adFirst.calculateExchangeRate(52.3f));

        ADLs17 adSecond = new ADLs17();
        adSecond.nameAd = "Interesting book";
        adSecond.priceAd = 1500;
        adSecond.descriptionAd = "Superman`s adventures";
        /*System.out.println("Ad category books " + adSecond.nameAd + "Price ad - " + adSecond.priceAd + "Description - " + adSecond.descriptionAd);*/
        adSecond.outputAdInfo();
        System.out.println(adSecond.calculateExchangeRate(55.5f));
    }
}

class ADLs17{
    String nameAd;
    int priceAd;
    String descriptionAd;

    void outputAdInfo(){ //no returns data method
        System.out.println("Ad category motors - " + nameAd + ", " + "Price ad - " + priceAd + ", " + "Description - " + descriptionAd);
    }

    float calculateExchangeRate(float val){
        return priceAd / val;
    }

    void setAdName(String inputAdName){
        nameAd = inputAdName;
    }
}