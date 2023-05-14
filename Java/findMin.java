public class findMin {
    public static void main(String[] args) {
        int[] arr = {1,-5,34,5,67,-8,9};
        System.out.println(Min(arr));
    }
    static int Min(int[] array){
        int ans = array[0];
        for(int i = 1; i<array.length;i++){
            if(array[i]<ans){
                ans = array[i];
            }
        }
        return ans;
    }
}
