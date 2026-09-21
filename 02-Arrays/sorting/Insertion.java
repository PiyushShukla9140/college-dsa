// Assume that the first element in the array is already sorted
// Step 2: start the outer loop with for(i=1 to n)
// Step 3: declare two variables
//.        int curr = to store the value of arr[i]
//.        int prev = stores the index of the previous elment to the curr
// Step 4: Now use while loop, check whether previous is greater than or equal to 0(so we dont go outside the array)
// and also check whether the element at prev index is greater than current
// Step 5: if boht conditions are true, store the prev index value in the ith index(current value index)
//          then decreament the prev counter
// Step 6: now store the curr value at prev+1 index


// The basic idea of this technique is to insert the unsorted part of the array into the sorted part of the array


import java.util.*;
public class Insertion{
    public static int[] insertion(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;

            while( prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }

        return arr;
    }
    public static void main(String [] args){
        int arr[] = {4,2,3,1,6,8,5,7};
        System.out.println(Arrays.toString(insertion(arr)));


    }
}