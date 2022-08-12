
public class StaticLs21 {
    public static void main(String [] args){

        /*DogLs21 tuzik = new DogLs21();
        DogLs21 sharik = new DogLs21();
        tuzik.setNickName("Tuzik");
        tuzik.setAge(3);
        sharik.setNickName("Sharik");
        sharik.setAge(6);*/

       /* DogLs21 tuzik = new DogLs21("Tuzik", 3);
        DogLs21 sharik = new DogLs21("Sharik", 6);
        DogLs21.dogBreed = "Terer";*/
        //DogLs21.getDogBreed();
       /* sharik.getAllFields();
        tuzik.getAllFields();
        DogLs21.dogBreed = "Spits";
        sharik.getAllFields();
        tuzik.getAllFields();*/

        DogLs21 tuzik = new DogLs21("Tuzik", 3);
        DogLs21 sharik = new DogLs21("Sharik", 6);
        tuzik.outputDogsNumber();
        sharik.outputDogsNumber();
        DogLs21 rex = new DogLs21("Rex", 2);
        tuzik.outputDogsNumber();
        sharik.outputDogsNumber();
        rex.outputDogsNumber();
    }
}

class DogLs21{
    private String nickName;
    private int age;

    private static int countDogs;

    public DogLs21(String nickName, int age){
        this.nickName = nickName;
        this.age = age;
        countDogs++;
    }

    public static String dogBreed;

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(getNickName() + ", " + getAge());
    }

    public static void getDogBreed(){
        System.out.println("Dog`s breed " + dogBreed);
    }

    public void getAllFields(){
        System.out.println("Dog - " + nickName + " dog`s age - " + age + " dog`s breed - " + dogBreed);
    }

    public void outputDogsNumber(){
        System.out.println("Number of dogs is " + countDogs);
    }

}