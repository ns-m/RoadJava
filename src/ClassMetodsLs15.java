public class ClassesAndObjectsLs14 {
    public static void main(String[] args) {

        AD adFirst = new AD();
        adFirst.nameAd = "Cool motorbike";
        adFirst.priceAd = 700000;
        adFirst.descriptionAd = "Best motorbike of the world!";
        System.out.println("Ad category motors - " + adFirst.nameAd + ", " + "Price ad - " + adFirst.priceAd + ", " + "Description - " + adFirst.descriptionAd);

        AD adSecond = new AD();
        adSecond.nameAd = "Interesting book";
        adSecond.priceAd = 1500;
        adSecond.descriptionAd = "Superman`s adventures";
        System.out.println("Ad category books " + adSecond.nameAd + "Price ad - " + adSecond.priceAd + "Description - " + adSecond.descriptionAd);
    }
}

class AD{
    String nameAd;
    int priceAd;
    String descriptionAd;
}