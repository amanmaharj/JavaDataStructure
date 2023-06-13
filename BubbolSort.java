public class BubbolSort {


    public static void swap(int[] array,int i,int j){

        if(i==j){
            return;
        }

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    public static void main(String[] args) {

        int[] arr1 = {1,21,11,7,66,62,23,21,44,28};

        for(int unsortedLastIndex = arr1.length-1; unsortedLastIndex > 0 ; unsortedLastIndex--){
            for(int i = 0; i < unsortedLastIndex; i++){
                if(arr1[i]>arr1[i+1]){
                    swap(arr1, i, i+1);
                }
            }
        }

        for(int i = 0 ; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
