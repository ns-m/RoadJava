package NestedClassesLs43;

public class Robocop {

    private int id;

    //nested non-static class
    private class Gun{
        public void shutGun(){
            System.out.println("Robocop - " + id + " is shutting!!!");
        }
    }

    //static nested class
    public static class Bullets{
        public void loadGun(){
            System.out.println("Load the gun.");
        }

    }

    public Robocop(int id){
        this.id = id;
    }

    public void start(){
        Gun gun = new Gun();
        gun.shutGun();

        System.out.println("Robocop - " + id + " is ready!");

        final int size = 43;
        //nested classes inside methods
        class Shoes {
            public void putOn(){
                System.out.println(size);
                System.out.println(id);
            }
        }
    }
}
