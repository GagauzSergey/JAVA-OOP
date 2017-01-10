package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by user on 03.01.2017.
 */
public class MainMatrix {

    public static void enterMatrixElements(int[][] arr, String name) {

        BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Enter matrix " + name + " elements");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    line = cons.readLine();
                    arr[i][j] = Integer.parseInt(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        //     ExecutorService service = Executors.newFixedThreadPool(3);

        int[][] a1 = new int[3][3];
        int[][] b1 = new int[3][3];

        MainMatrix.enterMatrixElements(a1, "a1");
        MainMatrix.enterMatrixElements(b1, "b1");
/*
        service.submit(new MatrixRun(a1, b1, 0));
        service.submit(new MatrixRun(a1, b1, 1));
        service.submit(new MatrixRun(a1, b1, 2));
*/
        new MatrixRun(a1, b1, 0).run();
        new MatrixRun(a1, b1, 1).run();
        new MatrixRun(a1, b1, 2).run();
    }
}
