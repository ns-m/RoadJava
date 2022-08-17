import PackageLs28a.PersonLs28a;
import PackageLs28a.ProtectedLs28;


public class MainLs28{

    public static void main(String[] args) {
        //public, private, default, protected - access modifiers

        PersonLs28a adam = new PersonLs28a();
        adam.colorEyes = "blue";
        //adam.colorHair = "dark"; don`t have access to default variable and method, if class not in right package

        PersonLs28a eva = new PersonLs28a();
        //System.out.println(eva.name); //'name' has protected access in 'PackageLs28a.PersonLs28a'
    }
}

class MainLs28b extends PersonLs28a{
    public MainLs28b(){
        name = "ichak";}
}


