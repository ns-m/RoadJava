
// "This" - the keyword invokes an object inside the class

public class ConstructorLs20 {
    public static void main(String [] args){
        /*DogLs20 tuzik = new DogLs20();*/
        //DogLs20 tuzik = new DogLs20("Tuzik");
        //DogLs20 tuzik = new DogLs20("Sharik", 7);
        DogLs20 tuzik = new DogLs20();
    }
}

class DogLs20{
    private String nickName;
    private int age;

    // method overloading

    /*public DogLs20(){
        System.out.println("Step 1 ....");
    }*/

    public DogLs20(String nickName){
        this.nickName = nickName;
        System.out.println("Step 2 ////");
    }

    public DogLs20(String nickName, int age){
        this.nickName = nickName;
        this.age = age;
        System.out.println("Step 3 ++++");

    }

    public DogLs20(){
        this.nickName = "Rex";
        this.age = 3;
        System.out.println("Step 1 .... " + nickName + " " + age);
    }

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

}