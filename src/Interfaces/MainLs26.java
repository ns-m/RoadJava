package Interfaces;

public class MainLs26 {

    public static void main(String[] args) {

        MammalsLs26 horse = new MammalsLs26(100);
        PersonLs26 adam = new PersonLs26("Adam");

        horse.sleep();
        adam.sayHello();
        System.out.println("-------------");
        horse.showInfo();
        adam.showInfo();
        System.out.println("-------------");
        InfoAbout info1 = new MammalsLs26(200);
        InfoAbout info2 = new PersonLs26("Eva");
        info1.showInfo();
        info2.showInfo();
        System.out.println("-------------");
        outputInfo(horse);
        outputInfo(adam);

    }

    public static void outputInfo(InfoAbout infoAbout){
        infoAbout.showInfo();
    }
}
