public class MultidimensionalArraysLs13 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3}; //one level array

        int[][] intMatrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < intMatrix.length; i++){
            for (int v = 0; v < intMatrix[i].length; v++){
                System.out.print(intMatrix[i][v] + " ");
            }
            System.out.println();
        }
    }
}
