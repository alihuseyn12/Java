public class BinarySearch {

   public int binarySearch(int[] arr, int l, int r, int target){
       System.out.println("Begin");
           while (l<=r){
              int mid=(l+r)/2;
               if(arr[mid]==target){
                   System.out.println("Fined Target "+arr[mid]);
                   return mid;
               }
               if(arr[mid]>target){
                   r=mid-1;
               }else {
                   l=mid+1;
               }
           }

       System.out.println("end");

        return -1;
    }
}