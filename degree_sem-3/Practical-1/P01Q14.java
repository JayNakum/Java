/* Write a program in Java to multiply two matrixes.
*/

import java.util.Scanner;

class Matrix {
    private int[][] matrixA = new int[3][3];
    private int[][] matrixB = new int[3][3];

    Matrix(int[][] matrixA, int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }

    int[][] multiply() {
        int[][] answer = new int[3][3];

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                for (int x = 0; x < 3; x++) {
                    answer[r][c] += matrixA[r][x] * matrixB[x][c];
                }
            }
        }

        return answer;
    }
}

public class P01Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrixA = new int[3][3];
        System.out.println("\nEnter elements of 3x3 matrix A: ");
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                matrixA[a][b] = sc.nextInt();
            }
        }

        int[][] matrixB = new int[3][3];
        System.out.println("\nEnter elements of 3x3 matrix B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        sc.close();

        Matrix obj = new Matrix(matrixA, matrixB);
        int[][] answer = obj.multiply();

        System.out.println("\n\nMultiplication = ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(answer[r][c]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
