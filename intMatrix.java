public class IntMatrix {

    int[][] matrix;

    public IntMatrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    public int numRows() {
        return matrix.length;
    }

    public int numCols() {
        return matrix[0].length;
    }

    /**
     * Return the element at [row, col]. Print an error if the input is invalid.
     *
     * @param row the row of the element
     * @param col the column of the element
     * @return the value at [row,col]
     */
    public int get(int row, int col)  {
        if (row >= 0 && row < this.matrix.length && col >= 0 && col < this.matrix[row].length) {
            return this.matrix[row][col];
        } else {
            System.out.println("Bad indices");
            return -1;
        }
    }

    /**
     * Set the element at [row,col] to be value. Print an error if the input is invalid.
     *
     * @param row the row containing the element
     * @param col the column containing the value
     * @param value the value to store
     */
    public void set(int row, int col, int value) {
        if (row >= 0 && row < this.matrix.length && col >= 0 && col < this.matrix[row].length) {
            this.matrix[row][col] = value;
        }else {
            System.out.println("Bad indices");
            return;
        }
    }


    public String toString() {
        return "IntMatrix{" +
                "matrix=" + matrix.toString() +
                '}';
    }

    /**
     * return an array of integers containing the elements of row r.
     * Print an error if the input is invalid.
     *
     * @param r The row we want to be accessed
     * @return The data in the row
     */
    public int[] getRow(int r) {
        if (r < 0 || r > this.matrix.length) {
            System.out.println("Invalid row number");
            return null;
        }else {
            int[] returnArray = new int[matrix[r].length];
            for (int i = 0;i < matrix[r].length;i++) {
                returnArray[i] = matrix[r][i];
            }
            return returnArray;
        }
    }

    /**
     * return an array of integers containing the elements of column c.
     * Print an error if the input is invalid.
     *
     * @param c
     * @return
     */

    public int[] getCol(int c) {
        if (c < 0 || c > this.matrix[0].length) {
            System.out.println("Invalid column number");
            return null;
        }else {
            int[] returnArray = new int[matrix.length];
            for (int i = 0;i < matrix.length;i++) {
                returnArray[i] = matrix[i][c];
            }
            return returnArray;
        }
    }

    /**
     * Return a new IntMatrix that is the sum of this matrix plus otherMatrix.
     * Recall that:
     * | a b|  +  |c  d| = |a+c  b+d|
     * | e f|     |g  h|   |e+g  f+h|
     * Print an error if the input is invalid.
     *
     * @param otherMatrix the matrix we want to add
     * @return a new matrix that is the sum of A and B
     */

    public IntMatrix add(IntMatrix otherMatrix) {
        if (this.numRows() != otherMatrix.numRows()
                || this.numCols() != otherMatrix.numCols()) {
            System.out.println("Cannot add these matrices, Different dimensionality");
            return null;
        }else {
            IntMatrix returnMatrix = new IntMatrix(this.numRows(), this.numCols());
            for (int i = 0;i < numRows();i++) {
                for (int j = 0; j < numCols();j++) {
                    returnMatrix.set(i, j, this.get(i,j) + otherMatrix.get(i, j));
                }
            }

            return returnMatrix;
        }
    }

    /**
     * Return a new IntMatrix that is the product of this matrix plus a scalar.
     * Recall that:
     * | a b|  * c = |ac  bc|
     * | e f|        |ec  fc|
     * Print an error if the input is invalid.
     *
     * @param scalar
     * @return
     */
    public IntMatrix multiply(int scalar) {

    }

    /**
     * Return a new IntMatrix that is the product of this matrix and otherMatrix.
     * Recall that:
     * | a b c|  *  |g  h| = |ag+bi+ck  ah+bj+cl|
     * | d e f|     |i  j|   |dg+ei+fk  dh+ej+fl|
     * |k  l|
     * Print an error if the input is invalid.
     *
     * @param otherMatrix
     * @return
     */
    public IntMatrix multiply(IntMatrix otherMatrix) {

    }

    /**
     * Return a new IntMatrix that is the transpose of this matrix.
     * Recall that the transpose of :
     * | a b|  is  |a  c|
     * | c d|      |b  d|
     *
     * @return
     */
    public IntMatrix transpose() {

    }
}

