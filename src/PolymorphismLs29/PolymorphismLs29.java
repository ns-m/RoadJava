package PolymorphismLs29;

public class PolymorphismLs29 {

    public static void main(String[] args) {

        /*MammalLs29 cow = new MammalLs29();
        CatLs29 murka = new CatLs29();

        cow.sleep();
        murka.sleep();*/

        //MammalLs29 animal = new CatLs29();
        /*animal.sleep();
        animal.sayMau();

        CatLs29 pushok = new CatLs29();
        pushok.sleep();
        pushok.sayMau();*/

        //animal.sleep();

        MammalLs29 mammal = new MammalLs29();
        CatLs29 murka = new CatLs29();
        BullLs29 borka = new BullLs29();

        generalMethod(mammal);
        generalMethod(murka);
        generalMethod(borka);
    }

    public static void generalMethod(MammalLs29 animal){
        animal.sleep();
    }
}
