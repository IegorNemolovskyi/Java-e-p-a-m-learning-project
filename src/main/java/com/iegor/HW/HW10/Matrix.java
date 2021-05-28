package com.iegor.HW.HW10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Matrix {
    private int row;
    private int column;
    private double[][] basicMatrix;
    private double[][] twoDimensionalArray;
    private String incompatibleMatrix = "Incompatible matrix sizes";

    /**
     * Implement a constructor that creates an empty matrix with a given number of rows
     * columns (all values in matrix equal 0.0)
     *
     * @param row    number of rows
     * @param column number of columns
     * @return Returns a new instance of the matrix with the specified parameters
     */
    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.basicMatrix = new double[row][column];
    }

    /**
     * Implement a constructor that creating of matrix based on existing two-dimensional array.
     *
     * @param twoDimensionalArray existing two-dimensional array
     * @return Returns a new instance of the matrix based on existing two-dimensional array
     * @throws MatrixException if the incoming array with zero number of rows returns the message "Array passed with zero number of rows",
     *                         if the incoming array with zero number of columns returns the message "Array passed with zero number of columns"
     */
    public Matrix(double[][] twoDimensionalArray) throws MatrixException {
        this.twoDimensionalArray = twoDimensionalArray;
        if (this.twoDimensionalArray.length == 0)
            throw new MatrixException("Array passed with zero number of rows");
        else if (this.twoDimensionalArray[0].length == 0)
            throw new MatrixException("Array passed with zero number of columns");
        else this.basicMatrix = twoDimensionalArray;
    }

    /**
     * @return Returns the number of rows in a matrix
     */
    public final int rows() {
        row = this.basicMatrix.length;
        return row;
    }

    /**
     * @return Returns the number of columns in a matrix
     */
    public final int columns() {
        column = this.basicMatrix[0].length;
        return column;
    }

    /**
     * Receiving of standard two-dimensional array out of matrix.
     *
     * @return Standard two-dimensional array
     */
    public double[][] twoDimensionalArrayOutOfMatrix() {
        double[][] twoDimensionalArrayOutOfMatrix;
        twoDimensionalArrayOutOfMatrix =  this.basicMatrix;
        return twoDimensionalArrayOutOfMatrix;
    }

    /**
     * Reading of elements via predetermined correct index
     *
     * @param row    number of rows
     * @param column number of columns
     * @return Returns the value of a matrix element <code>[row,column]</code>
     * @throws MatrixException if index incorrect, returns message "Incompatible matrix sizes"
     */
    public double getValue(int row, int column) throws MatrixException {
        double matrixElement;
        if (row >= this.basicMatrix.length ||
                column >= this.basicMatrix[0].length)
            throw new MatrixException(incompatibleMatrix);
        else matrixElement = this.basicMatrix[row][column];
        return matrixElement;
    }

    /**
     * Recording value <code>newValue</code> of elements via predetermined correct index <code>[row,column]</code>     *
     *
     * @param row      number of rows
     * @param column   number of columns
     * @param newValue new value of a matrix element
     * @throws MatrixException if index incorrect, returns message "Incompatible matrix sizes"
     */
    public void setValue(int row, int column, double newValue) throws MatrixException {
        if (row >= this.basicMatrix.length ||
                column >= this.basicMatrix[0].length)
            throw new MatrixException(incompatibleMatrix);
        else this.basicMatrix[row][column] = newValue;
    }

    /**
     * Method of matrix's addition  <code>matrix</code>.
     * Result in the original matrix
     *
     * @param matrix matrix corresponding to the second term
     * @return Returns a new resulting matrix
     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
     */
    public Matrix addition(Matrix matrix) throws MatrixException {
        double[][] matrix1 = this.basicMatrix;
        System.out.println("First Matrix");
        System.out.println(Arrays.deepToString(matrix1));
        double[][] matrix2 = matrix.twoDimensionalArrayOutOfMatrix();
        System.out.println("Second Matrix");
        System.out.println(Arrays.deepToString(matrix2));
        double[][] operationResult = new double[this.rows()][this.columns()];
        if (matrix.rows() != this.rows() || matrix.columns() != this.columns())
            throw new MatrixException(incompatibleMatrix);
        else
            for (int i = 0; i < this.rows(); i++) {
                for (int j = 0; j < this.columns(); j++) {
                    operationResult[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        System.out.println("Result of operation: ");
        System.out.println(Arrays.deepToString(operationResult));
        return new Matrix(operationResult);
    }

    /**
     * Method of matrix's deduction <code>matrix</code> from original.
     * Result in the original matrix
     *
     * @param matrix matrix corresponding to the subtracted
     * @return Returns a new resulting matrix
     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
     */
    public Matrix subtraction(final Matrix matrix) throws MatrixException {
        double[][] matrix1 = this.basicMatrix;
        System.out.println("First Matrix");
        System.out.println(Arrays.deepToString(matrix1));
        double[][] matrix2 = matrix.twoDimensionalArrayOutOfMatrix();
        System.out.println("Second Matrix");
        System.out.println(Arrays.deepToString(matrix2));
        double[][] operationResult = new double[this.rows()][this.columns()];
        if (matrix.rows() != this.rows() || matrix.columns() != this.columns())
            throw new MatrixException(incompatibleMatrix);
        else
            for (int i = 0; i < this.rows(); i++) {
                for (int j = 0; j < this.columns(); j++) {
                    operationResult[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        System.out.println("Result of operation: ");
        System.out.println(Arrays.deepToString(operationResult));
        return new Matrix(operationResult);
    }

    /**
     * Method of matrix's multiplication <code>matrix</code>
     * Result in the original matrix
     *
     * @param matrix matrix corresponding to the second factor
     * @return Returns a new resulting matrix
     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
     */
    public Matrix multiplication(final Matrix matrix) throws MatrixException {
        double[][] matrix1 = this.basicMatrix;
        System.out.println("First Matrix");
        System.out.println(Arrays.deepToString(matrix1));
        double[][] matrix2 = matrix.twoDimensionalArrayOutOfMatrix();
        System.out.println("Second Matrix");
        System.out.println(Arrays.deepToString(matrix2));
        double[][] operationResult = new double[this.rows()][matrix.columns()];
        if (matrix.rows() != this.rows() || matrix.columns() != this.columns() || this.rows() != matrix.columns())
            throw new MatrixException(incompatibleMatrix);
        else
            for (int i = 0; i < this.rows(); i++) {
                for (int j = 0; j < matrix.columns(); j++) {
                    for (int k = 0; k < this.columns(); k++) {
                        operationResult[i][j] = operationResult[i][j] + matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        System.out.println("Result of operation: ");
        System.out.println(Arrays.deepToString(operationResult));
        return new Matrix(operationResult);
    }

//    @Override
//    public String toString() {
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < this.rows(); i++) {
//            for (int j = 0; j < this.columns(); j++) {
//                try {
//                    if (j != this.columns() - 1) {
//                        builder.append(decimalFormat.format(getValue(i, j)) + " ");
//                    } else {
//                        builder.append(decimalFormat.format(getValue(i, j)));
//                    }
//                } catch (MatrixException e) {
//                    e.getMessage();
//                }
//            }
//            builder.append("\n");
//        }
//        return builder.toString();
//    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.basicMatrix);
//                + "\nNumber of rows is: " + this.rows()
//                + "\nNumber of columns is: " + this.columns()
//                + "\n2D array out of matrix:" + Arrays.deepToString(this.twoDimensionalArray)
//                +"\n";
    }
}
