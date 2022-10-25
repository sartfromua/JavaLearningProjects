package HW_5;

import CW_HW_4.Point;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_3_2_10 {

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int[] ints : matrix) {
            for (int el: ints) {
                System.out.print(el + " ");
                if (el < 10) System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int[] findMaxCord(int[][] matrix) {
        int max_el = Integer.MIN_VALUE;
        int[] res = new int[2];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                if (matrix[i][j] > max_el) {
                    res[0] = i;
                    res[1] = j;
                    max_el = matrix[i][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matrix[i][j] = rand.nextInt(50);
            }
        }

        printMatrix(matrix);

        int[] cord = findMaxCord(matrix);
        System.out.println("\nPos of max el: " + Arrays.toString(cord));

        int[][] new_matr = new int[n-1][n-1];
        int i1 = 0, j1 = 0;

        for (int i=0; i<n; i++) {
            j1 = 0;
            for (int j=0; j<n; j++) {
                new_matr[i1][j1] = matrix[i][j];
                j1++;
                if (j+1 == cord[1]) j++;
            }
            if (i+1 == cord[0]) i++;
            i1++;
        }

        printMatrix(new_matr);


    }
}
