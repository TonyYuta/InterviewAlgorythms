package AlgorythmsHandsOnExperience;

import java.util.Arrays;

public class MiniMaxSum {
public static void main(String[] args){
    int[] arr1 = {1,3,5,7,9};
    int[] arr2 = {-1,3,5,7,-9};
    int[] arr3 = {1,1,1,1,1};
    int[] arr4 = {0,1,1,1,-2};
    int[] arr5 = {1,2,3,4,5};
    int[] arr6 = {2147483647,2147483647,2147483647,2147483647,2147483647};

    //miniMaxSum(arr1);
    //miniMaxSum(arr2);
    //miniMaxSum(arr3);
    //miniMaxSum(arr4);
    //miniMaxSum(arr5);
    miniMaxSum(arr6);

}
static void miniMaxSum(int[] arr) {
        long min = 0, max = 0;
        Arrays.sort(arr);
  //  System.out.println("min:");

    for(int i=0;i<4;i++){
            min+=arr[i];
      //      System.out.println(arr[i]);
        }

    //System.out.println("max:");

    for(int i=arr.length-1;i>=arr.length-4;i--){
            max+=arr[i];
        //    System.out.println(arr[i]);
        }

 //   System.out.println("min max:");

    System.out.print( min+ " " + max );
    }
}
