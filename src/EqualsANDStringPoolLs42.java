public class EqualsANDStringPoolLs42 {

    public static void main(String[] args) {

        //you can compare primitive data types
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        //comparison of reference data types
        Tree cedar = new Tree(100);
        Tree oak = new Tree(100);

        System.out.println(cedar == oak);
        System.out.println(cedar.equals(oak));

        String myString = "Step 1";
        String anyString = "Step 2";

        System.out.println(myString.equals(anyString));

        //String pool
        System.out.println(myString == anyString);

    }
}

class Tree{
    private int id;

    public Tree(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Tree anyTree = (Tree) obj;
        return this.id == anyTree.id;
    }
}
