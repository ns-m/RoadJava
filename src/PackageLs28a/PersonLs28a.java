package PackageLs28a;

public class PersonLs28a {

    public String colorEyes;
    String colorHair;
    private String colorSkin  = "brown";
    //colorSkin must use only here
    public void infoSkin() {
        System.out.println(colorSkin);
    }

    protected String name;
    public PersonLs28a(){
        name = "Adam";
    }
}


