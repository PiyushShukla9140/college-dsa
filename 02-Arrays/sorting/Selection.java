// Step 1: run the loop till 0 to n-1 (why not n? => Because we only need n-1 no of iterations to sort the array
//  maltab agar array me 4 elements hai toh 3 hi iterations required h for sorting last wala automatically perfect aa jaayega)
// Step 2: initialize a minPos variable and store the i in it(index where the current min is there)
// Step 3: run the inner loop from j=i+1 to n apply a condition tha if element at minPostion is greater the element at j then store j in the minpos
// (eg: {2,1,3,4,5} agar i=0, j=i+1=2, minPos = i =0. Now here you can see that element at minPos is greater than j therefpre minPos should be on j)

// Step 4: Now perform swapping, minPos element in temp, arr[i] in minPos , temp in arr[i]


import java.util.*;
public class Selection{
    public static int[] selection(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){ // for descending use arr[j]>arr[minPos]
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[]args){
        int arr[] = {4,2,6,1,3,9};
        System.out.println(Arrays.toString(selection(arr)));

    }
}