public class max_num {
    public static void main(String[] args) {
        int[] arr = {1,10,100,1000,500};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxNumber = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>maxNumber){
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

}
