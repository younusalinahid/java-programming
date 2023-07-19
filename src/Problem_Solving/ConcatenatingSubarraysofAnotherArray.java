package Problem_Solving;

public class ConcatenatingSubarraysofAnotherArray {
    public static void main(String[] args) {

        int[][] groups = {{1, -1, -1}, {3, -2, 0}};
        int[] nums = {1, -1, 0, 1, -1, -1, 3, -2, 0};

        int row = 0;
        for (int i = 0; i < nums.length; i++) {
            int col = 0;
            int j = i;

            while (col < groups[row].length && j < nums.length && nums[j] == groups[row][col]) {
                col++;
                j++;
            }
            if (groups[row].length == col) {
                row++;
                i = j - 1;
            }
            if (row == groups.length) {
                System.out.println(true);
            }
        }
    }
}