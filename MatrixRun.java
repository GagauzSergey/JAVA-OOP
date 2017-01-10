package Matrix;

/**
 * Created by user on 03.01.2017.
 */
public class MatrixRun implements Runnable {
    int[][] arr1;
    int[][] arr2;
    int[][] c = new int[3][3];
    int n;

    protected MatrixRun(int[][] arr1, int[][] arr2, int n) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.n = n;
    }

    @Override
    public void run() {
        int c1, c2, c3;
        c1 = (arr1[n][0] * arr2[0][0]) + (arr1[n][1] * arr2[1][0]) + (arr1[n][2] * arr2[2][0]);
        c2 = (arr1[n][0] * arr2[0][1]) + (arr1[n][1] * arr2[1][1]) + (arr1[n][2] * arr2[2][1]);
        c3 = (arr1[n][0] * arr2[0][2]) + (arr1[n][1] * arr2[1][2]) + (arr1[n][2] * arr2[2][2]);
        matrixC(c1, c2, c3, n);
    }

    public void matrixC(int a1, int a2, int a3, int number) {
        c[number][0] = a1;
        c[number][1] = a2;
        c[number][2] = a3;
        printResultMatric(c);
    }

    public void printResultMatric(int[][] arr3) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr3[i][j] != 0)
                    System.out.print(arr3[i][j] + " ");
            }
        }
        System.out.println();
    }
}
