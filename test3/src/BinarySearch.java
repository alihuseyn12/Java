public class BinarySearch {
    int binarySearch(int []arr,int left,int right, int target){

        while (right>=left){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                return mid ;
            }
            if(arr[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
         return -1;
    }
}
