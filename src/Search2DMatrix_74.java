/**
 * @author: basavakanaparthi
 * on 28,Oct,2016 at 1:56 AM.
 */

public class Search2DMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        int startRow = 0;
        int endRow = row-1;
        int prevRow = -1;
        while(startRow < endRow)
        {
            if (prevRow == startRow)
                break;
            int mid = startRow + (endRow - startRow)/2;
            if (matrix[mid][0] == target)
                return true;
            if (matrix[mid][0] > target)
                endRow = mid-1;
            else
                startRow = mid;
            prevRow = startRow;
        }
        System.out.println(startRow + " " + endRow);
        if(startRow < row) {
            for (int j = 0; j < col; j++) {
                if (matrix[startRow][j] == target)
                    return true;
            }
        }
        if(endRow >= 0) {
            for (int j = 0; j < col; j++) {
                if (matrix[endRow][j] == target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,   3,  5,  7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 50}};
        System.out.println(searchMatrix(arr,23));
    }
}
