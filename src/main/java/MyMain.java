public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int counter = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if((int)Math.abs(mat[i][j]) % 2 == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] >maxVal) {
                    maxVal = mat[i][j];
                }
            }
        }
        return maxVal;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        int[][] newMat = new int[mat.length][mat[0].length];
        for(int row=0; row<mat.length; row++) {
            for(int col=0; col<mat[row].length; col++) {
                newMat[row][col] = mat[row][(col+1) % mat[0].length];
            }
        }

        return newMat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] mat = new int[arraySize][arraySize];
        for(int row = 0; row<mat.length; row++) {
            for(int col = 0; col<mat[row].length; col++) {
                mat[row][col] = row + col;
            }
        }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double sum = 0.0;
        double total = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j = 0; j<mat[0].length; j++) {
                sum = sum + mat[i][j];
                total = total + 1.0;
            }
        }
        return sum/total;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        double answer = 0;
        double[] arr = new double[mat.length*mat[0].length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = mat[i/mat[0].length][i%mat[0].length];
        }
        if(arr.length % 2 == 0) {
            answer = (arr[arr.length/2] + arr[(arr.length/2) - 1])/2;
        }
        else if(arr.length % 2 == 1) {
            answer = (arr[(arr.length-1)/2]);
        }
        return answer;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        double maxVal = 0.0;
        double maxCount = 0.0;
        double[] arr = new double[mat.length*mat[0].length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = mat[i/mat[0].length][i%mat[0].length];
        }
        for(int j=0; j<arr.length; j++) {
            int count = 0;
            for(int k=0; k<arr.length; k++) {
                if(arr[k] == arr[j]) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                maxVal = arr[j];
            }

        }
        return maxVal;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
