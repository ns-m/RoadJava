package NestedClassesLs43;

public class NestedClassesLs43 {

    public static void main(String[] args) {

        Robocop roboJohn = new Robocop(100);
        roboJohn.start();

        //logical grouping
        Robocop.Bullets bullets = new Robocop.Bullets();
    }
}
