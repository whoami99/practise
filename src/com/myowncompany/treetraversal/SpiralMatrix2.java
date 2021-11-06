package com.company.treetraversal;

public class SpiralMatrix2 {

    public static void main(String[] args){
        SpiralMatrix2 m = new SpiralMatrix2();
        int matrixSize = 6;
        m.printMatrix(m.generateMatrix(matrixSize), matrixSize);
    }

    private void printMatrix(int[][] matrix, int n) {
        for(int i =0; i< n; i++){
            for(int j =0; j<n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }

    public int[][] generateMatrix(int n) {

        int[][] output = new int[n][n];
        int nextCellValue= 1;
        int currentN = n;
        int currentI = 0;
        int currentJ = 0;

        int itereationNumber = 1;
        int numberOfIterations = (int) Math.ceil((double)n/2);
        while (itereationNumber<=numberOfIterations) {
            currentI=itereationNumber-1;
            currentJ=itereationNumber-1;
            for (int i = currentI, j = currentJ; j < currentN; j++) {
                output[i][j] = nextCellValue++;
            }
            currentI += 1;
            currentJ = currentN - 1;
            for (int j = currentJ, i = currentI; i < currentN; i++) {
                output[i][j] = nextCellValue++;
            }
            currentI = currentN - 1;
            currentJ = currentN - 2;
            for (int j = currentJ, i = currentI; j >= n - currentN; j--) {
                output[i][j] = nextCellValue++;
            }
            currentI = currentN - 2;
            currentJ = n - currentN;
            for (int i = currentI, j = currentJ; i > n - currentN; i--) {
                output[i][j] = nextCellValue++;
            }
            currentN--;
            itereationNumber++;
        }
        return output;
    }
}