public class LatinSquare {

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the sum of consecutive integers 1 + 2 + ... + N
     */
    public static int targetCheckSum1(int rowSize) {

        int sum = 0;

        for(int i = 1; i <= rowSize; i++){

            sum += i;

        }


        return sum;
    }

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the product of consecutive integers 1 * 2 * ... * N
     */
    public static int targetCheckSum2(int rowSize) {

        int prod = 1;

        for(int i = 1; i <= rowSize; i++){

            prod *= i;

        }


        return prod;
    }


    /**
     *
     * @param array2d
     * @return whether or not every row's sum in array2d is equal to targetCheckSum1(),
     *         AND that every row's product in array2d is equal to targetCheckSum2()
     */
    public static boolean isLatinRows(int[][] array2d) {

        boolean result;

        int sum = 0;
        int checkSum = targetCheckSum1(array2d.length);
        int checkProd = targetCheckSum2(array2d.length);

        for(int[] i: array2d){

            sum = 0;

            for(int a: i){

                sum += a;

            }

            if(sum != checkSum){

                return false;

            }

        }

        for(int[] i: array2d){

            sum = 1;

            for(int a: i){

                sum *= a;

            }

            if(sum != checkProd){

                return false;

            }

        }


        return true;
    }

    /**
     *
     * @param array2d
     * @return whether or not every column's sum in array2d is equal to targetCheckSum1(),
     *         AND that every column's product in array2d is equal to targetCheckSum2()
     */
    public static boolean isLatinColumns(int[][] array2d) {
        boolean result;

        int sum = 0;
        int checkSum = targetCheckSum1(array2d.length);
        int checkProd = targetCheckSum2(array2d.length);

        for(int i = 0; i < array2d[0].length; i++){

            sum = 0;

            for(int j = 0; j < array2d.length; j++){

                sum += array2d[j][i];

            }

            if(sum != checkSum){

                return false;

            }

        }

        for(int i = 0; i < array2d[0].length; i++){

            sum = 1;

            for(int j = 0; j < array2d.length; j++){

                sum *= array2d[j][i];

            }

            if(sum != checkProd){

                return false;

            }

        }


        return true;
    }


    /**
     *
     * @param array2d
     * @return whether array2d is a Latin square or not.
     *         Hint: make use of isLatinRows and isLatinColumns
     */
    public static boolean isLatinSquare(int[][] array2d) {

        if(isLatinRows(array2d) && isLatinColumns(array2d)){

            return true;

        }

        return false;
    }

    /** OPTIONAL (only do if you have time)
     *
     * @param array2d
     * @return whether or not array2d is a latin square
     *         as well as whether the sum and product of each of the two main diagonals is equal
     *         to the checkSums or not.
     *
     * NOTE: not all Latin squares are diagonal; for example, diagonal Latin squares do not exist for 2x2 or 3x3
     */
    public static boolean isDiagonalLatinSquare(int[][] array2d) {
        return false;
    }

}
