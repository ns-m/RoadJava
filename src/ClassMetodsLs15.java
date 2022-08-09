public class ClassMetodsLs15 {
    public static void main(String[] args) {

        ADLs15 adFirst = new ADLs15();
        adFirst.nameAd = "Cool motorbike";
        adFirst.priceAd = 700000;
        adFirst.descriptionAd = "Best motorbike of the world!";
        /*System.out.println("Ad category motors - " + adFirst.nameAd + ", " + "Price ad - " + adFirst.priceAd + ", " + "Description - " + adFirst.descriptionAd);*/
        adFirst.outputAdInfo();

        ADLs15 adSecond = new ADLs15();
        adSecond.nameAd = "Interesting book";
        adSecond.priceAd = 1500;
        adSecond.descriptionAd = "Superman`s adventures";
        /*System.out.println("Ad category books " + adSecond.nameAd + "Price ad - " + adSecond.priceAd + "Description - " + adSecond.descriptionAd);*/
        adSecond.outputAdInfo();
    }
}

class ADLs15{
    String nameAd;
    int priceAd;
    String descriptionAd;

    void outputAdInfo(){
        System.out.println("Ad category motors - " + nameAd + ", " + "Price ad - " + priceAd + ", " + "Description - " + descriptionAd);
    }
}