
// "This" - the keyword invokes an object inside the class

public class ConstructorLs20 {
    public static void main(String [] args){
        DogLs20 tuzik = new DogLs20();

    }
}

class DogLs20{
    private String nickName;
    private int age;

    public DogLs20(){

    }

    public DogLs20(String nickName){

    }

    public DogLs20(String nickName, int age){

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