
/*class Star implements CanLight{
    @Override
    public void light() {
        System.out.println("Star light!");
    }

    *//*public void light(){
        System.out.println("Star light!");
    }*//*
}*/

/*
class SuperStar extends Star{
    public void light(){
        System.out.println("Super star is lighting!");
    }
}*/

interface CanLight{
    public void light();
}

public class AnonymousClassesLs35 {
    public static void main(String[] args) {
        /*Star sun = new Star();
        sun.light();*/
        /*SuperStar superSun = new SuperStar();
        superSun.light();*/

        /*Star bigStar = new Star(){
            public void light(){
                System.out.println("Big star is super light...");
            }
        };
        bigStar.light();*/

        /*CanLight canLight = new Star();
        canLight.light();*/

        CanLight canLight = new CanLight() {
            @Override
            public void light() {
                System.out.println("...White...");
            }
        };

        canLight.light();
    }
}