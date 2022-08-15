
public class ObjectAnDtoStringLs24 {
    public static void main(String [] args){

        TestClassLs24 testObj = new TestClassLs24();
        System.out.println(testObj); //print hash

        TestClassLs24b testObj2 = new TestClassLs24b("Next step", 2022);
        System.out.println(testObj2);
    }
}

class TestClassLs24{
    private String testStr;
    private int testInt;
}

class TestClassLs24b{
    private String testStr;
    private int testInt;

    public TestClassLs24b(String testStr, int testInt){
        this.testStr = testStr;
        this.testInt = testInt;
    }

    //reload method toString()
    public String toString(){
        return testStr + ", " + testInt;
    }
}
