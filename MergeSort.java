public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20,32,-15,7,55,1,-22};

        mergeSort(intArray, 0, intArray.length);

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int mid = (start + end) /2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid-1]<=input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while(i<mid && j<end){
            temp[tempIndex++] = input[i]<=input[j] ? input[i++] : input[j++];
        }

        //{32,34} , {33,36}
        //32,33,34,36 WE DONT HAVE TO HANDLE THE LEFTOVER ELEMENT IN RIGHT as when merge the position wont change.

        //{32,36}, {33,34}
        //{32,33,34,} WE HAVE TO HANDLE THE LEFTOVER ELEMENT IN LEFT ARRAY AS WHEN MERGE THE POSITION OF 36 CHANGE FROM 1 TO 3 POSITION

        System.arraycopy(input, i, input, start + tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
        //System.arraycopy(sourceArray, sourceStartIndex, destinationArray, destinationStartIndex, length);

    }
}
