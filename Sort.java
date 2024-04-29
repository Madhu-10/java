import java.util.*;
public class Sort {
   public static void main(String[] args) {
    Integer arr[]={5,6,3,1,7,2,4};
    // Arrays.sort(arr);
    Arrays.sort(arr,Collections.reverseOrder());
    
    // Arrays.sort(arr,1,4);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   } 
}
