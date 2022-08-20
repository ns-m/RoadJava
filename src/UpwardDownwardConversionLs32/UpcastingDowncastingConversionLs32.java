package UpwardDownwardConversionLs32;

public class UpcastingDowncastingConversionLs32 {

    public static void main(String[] args) {

        //UpcastingUpcasting
        MammalLs32 animal = new CatLs32();
        CatLs32 cats = new CatLs32();
        MammalLs32 pushok = cats;

        //Downcasting
        CatLs32 kiss = (CatLs32) pushok;
        kiss.meow();

    }
}
