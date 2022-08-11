import java.util.Scanner;

public class EncapsulationSettersAndGettersLs18 {
    public static void main(String[] args) {

        ADLs18 adFirst = new ADLs18();
        Scanner inputData = new Scanner(System.in);
        adFirst.setNameAd(inputData.nextLine());
        adFirst.setDescriptionAd(inputData.nextLine());
        adFirst.setPriceAd(inputData.nextInt());

        adFirst.setAdNamePriceAdDescAd(adFirst.getNameAd(), adFirst.getDescriptionAd(), adFirst.getPriceAd());
        adFirst.outputAdInfo();
    }
}

class ADLs18{
    private String nameAd;
    private String descriptionAd;
    private int priceAd;

    public void setNameAd(String nameAd) {
        if (nameAd.isEmpty()){
            System.out.println("You must input ad`s name!");
        }else {
        this.nameAd = nameAd;}
    }

    public String getNameAd() {
        return nameAd;
    }

    public void setDescriptionAd(String descriptionAd) {
        if (descriptionAd.isEmpty()){
            System.out.println("You must input ad`s description!");
        }else {
            this.descriptionAd = descriptionAd;}
    }

    public String getDescriptionAd() {
        return descriptionAd;
    }

    public void setPriceAd(int priceAd) {
        if (priceAd < 0){
            System.out.println("You must input ad`s price!");
        }else {
        this.priceAd = priceAd;}
    }

    public int getPriceAd() {
        return priceAd;
    }

    void outputAdInfo(){
        System.out.println("Ad category motors - " + nameAd + ", " + "Price ad - " + priceAd + ", " + "Description - " + descriptionAd);
    }


    void setAdNamePriceAdDescAd(String inputAdName, String inputDescAd, int inputPriceAd){
        nameAd = inputAdName;
        priceAd = inputPriceAd;
        descriptionAd = inputDescAd;
    }
}