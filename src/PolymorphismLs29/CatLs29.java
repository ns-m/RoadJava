package PolymorphismLs29;

public class CatLs29 extends MammalLs29{

    public void sayMau(){
        System.out.println("Cat says Mau!");
    }

    @Override
    public void sleep(){
        System.out.println("Cat is sleeping.");
    }
}
