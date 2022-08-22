package WildcardsLs34;

import java.util.ArrayList;
import java.util.List;

public class WildcardsLs34 {

    public static void main(String[] args) {

        List<TreeLs34> treeLs34List = new ArrayList<>();
        treeLs34List.add(new TreeLs34(100));
        treeLs34List.add(new TreeLs34(200));



        treeTest(treeLs34List);
    }

    private static void treeTest(List<TreeLs34> list){

        for (TreeLs34 tree: list
             ) {
            System.out.println(tree);
        }
    }
}
