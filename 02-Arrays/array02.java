// binary search question 
// verifying the sum of two any elements in array is 25 or not
// leeetcode 167
import java.util.*;
public class array02{
    public static boolean search(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    


    // opitmal
    public static int[] optimal(int arr[],int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int result[] = new int[2];
        // if the target is greater than the sum of both the pointers than increase the starting pointer and if it is smaller decrease the ending poiunter
        while(start<=end){
            if(arr[start]+arr[end]==target){
                result[0] = start+1;
                result[1] = end+1;
                break;
                // why are we using break here?
                // Because in some test case, start = 6 aur end bhi 6 hai and aswer aa gya h
                // toh phir bhi yeh loop chalta chala jaayega aur real answer ko destroy kr dega isliye break lgana jarurui tha

            }
            if(arr[start]+arr[end]<target){
                start++;
            }else{
                end--;
            }
        }
        return result;

    }
    public static void main(String[]args){
        int arr[] = {2,5,15,20,25};
        int target = 25;
        System.out.println(Arrays.toString(optimal(arr,target)));
    }
}


