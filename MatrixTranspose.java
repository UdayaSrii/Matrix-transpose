import java.util.Scanner;
public class MatrixTranspose {
    // Create a 2D array to represent the matrix
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);
        // The number of rows in the matrix
        System.out.print("Enter the number of rows of the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int cols = sc.nextInt();
        // The initialization of the matrix
        int[][] matrix = new int[rows][cols];
        // The initialization of the transposed matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // A new 2D array to store the transposed matrix
        int[][] transpose = new int[cols][rows];
        // The transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // The output of the transposed matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // The output of the transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

