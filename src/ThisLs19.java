
// "This" - the keyword invokes an object inside the class

public class ThisLs19 {
    public static void main(String [] args){
        Dog tuzik = new Dog();
        tuzik.setNickName("www");
        tuzik.setAge(10);
        tuzik.getInfo();
    }
}

class Dog{
    private String nickName;
    private int age;

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