package Interfaces;

public class MammalsLs26 implements InfoAbout {

    public int id;

    public MammalsLs26(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Animal sleeping!");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is - " + this.id);
    }
}
