// bubble sort
import java.util.*;
public class Bubble{
    public static int[] sort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            // Why use n-1 and not n?
            // Suppose arr.length =4, then we need atleast 3 passes to sort 4 elements
            //Why not 4?
            //Because after 3 passes, the last remaining element is automatically in its correct position.
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] optimalSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for (int j=0;j<n-i-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                swapped = true;
            }

            if(!swapped){
                break;
            }

        }

        return arr;

    }
    public static void main(String[]args){
        int arr[] = {2,4,6,3,1,8,7};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(optimalSort(arr)));



    }
}