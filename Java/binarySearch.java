public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-5, -3, 0, 2 ,5, 7, 8, 9, 10};
        int target = 8;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end  = arr.length -1;

        while (start <= end){
            int midVal = start + (end - start) / 2;
            if(target < arr[midVal]) {
                end = midVal - 1;
            }
            else if(target > arr[midVal]){
                    start = midVal +1;
            }
            else{
                return  midVal;
            }
        }
        return -1;
    }
}
