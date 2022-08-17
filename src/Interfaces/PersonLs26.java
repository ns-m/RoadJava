package Interfaces;

public class PersonLs26 implements InfoAbout {

    public String name;

    public PersonLs26(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Salame");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is - " + this.name);
    }
}
