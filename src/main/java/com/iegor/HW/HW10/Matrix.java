package com.iegor.HW.HW10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Matrix {
    private int row;
    private int column;
    private double[][] matrix;
    private double matrixElement = 0;
    private double[][] twoDimensionalArray;
    private double[][] twoDimensionalArrayOutOfMatrix;

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
        this.matrix = new double[row][column];
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
        try {
            if (this.twoDimensionalArray.length == 0)
                throw new MatrixException("Array passed with zero number of rows");
            else if (this.twoDimensionalArray[0].length == 0)
                throw new MatrixException("Array passed with zero number of columns");
            else this.matrix = twoDimensionalArray;
        } catch (MatrixException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * @return Returns the number of rows in a matrix
     */
    public final int rows() {
        row = this.matrix.length;
        return row;
    }

    /**
     * @return Returns the number of columns in a matrix
     */
    public final int columns() {
        column = this.matrix[0].length;
        return column;
    }

    /**
     * Receiving of standard two-dimensional array out of matrix.
     *
     * @return Standard two-dimensional array
     */
    public double[][] twoDimensionalArrayOutOfMatrix() {
        twoDimensionalArrayOutOfMatrix =  this.matrix;
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
        try {
            if (row >= this.matrix.length ||
                    column >= this.matrix[0].length)
                throw new MatrixException("Incompatible matrix sizes");
            else matrixElement = this.matrix[row][column];
        } catch (MatrixException e) {
            System.err.println(e.getMessage());
        }
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
        this.row = row;
        this.column = column;
        try {
            if (row >= this.matrix.length ||
                    column >= this.matrix[0].length)
                throw new MatrixException("Incompatible matrix sizes");
            else this.matrix[row][column] = newValue;
        } catch (MatrixException e) {
            System.err.println(e.getMessage());
        }
    }

//    /**
//     * Method of matrix's addition  <code>matrix</code>.
//     * Result in the original matrix
//     *
//     * @param matrix matrix corresponding to the second term
//     * @return Returns a new resulting matrix
//     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
//     */
//    public Matrix addition(Matrix matrix) throws MatrixException {
//        this.matrix = matrix;
//        Matrix sumOfMatrix = new Matrix (this.twoDimensionalArray[0].length, this.twoDimensionalArray.length);
//        for (int i = 0; i < this.twoDimensionalArray.length; i++){
//            for (int j = 0; j < this.twoDimensionalArray[0].length; j++){
//                sumOfMatrix = matrix * matrix;
//                return sumOfMatrix[i][j];
//            }
//
//        }
//
//
//
//
//
//
//        //TODO: Delete line below and write your own solution;
//        throw new UnsupportedOperationException();
//    }

//    /**
//     * Method of matrix's deduction <code>matrix</code> from original.
//     * Result in the original matrix
//     *
//     * @param matrix matrix corresponding to the subtracted
//     * @return Returns a new resulting matrix
//     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
//     */
//    public Matrix subtraction(final Matrix matrix) throws MatrixException {
//        //TODO: Delete line below and write your own solution;
//        throw new UnsupportedOperationException();
//    }
//
//    /**
//     * Method of matrix's multiplication <code>matrix</code>
//     * Result in the original matrix
//     *
//     * @param matrix matrix corresponding to the second factor
//     * @return Returns a new resulting matrix
//     * @throws MatrixException if incompatible matrix sizes, returns message "Incompatible matrix sizes"
//     */
//    public Matrix multiplication(final Matrix matrix) throws MatrixException {
//        //TODO: Delete line below and write your own solution;
//        throw new UnsupportedOperationException();
//    }
//
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
        return Arrays.deepToString(this.matrix)
                + "\nNumber of rows is: " + this.rows()
                + "\nNumber of columns is: " + this.columns()
                + "\n2D array out of matrix:" + Arrays.deepToString(this.twoDimensionalArray)
                +"\n";
    }
}
