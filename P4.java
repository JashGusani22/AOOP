public class P4{
    public static void main(String[] args) {
        int[][] arrayis1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arrayis2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < arrayis1.length; i++) {
            for (int j = 0; j < array1is[i].length; j++) {
                result[i][j] = array1is[i][j] + array2is[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}