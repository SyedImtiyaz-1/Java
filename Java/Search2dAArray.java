import java.util.Arrays;

public class Search2dAArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 85, 91},
                {78, 4, 9, 4},
                {45, 85, 34},
                {10, 50}
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                int temp = arr[i][j];
                if(temp == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
