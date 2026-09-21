// Merge sort works on divide and conquer 
// We will divide the entire array in such a way (from the mid) that after the division, each element of that array becomes the individaul array
// Then after dividsion start conquering the array by comparing those elemets with each other


// Algo: We will use use two fuctions here 
//       First one will be used to just divide the array using recurrsion
//       Second one to merge the individual element arrays


import java.util.*;
public class Merge{
    public static void merge(int arr[],int mid, int start, int end){
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while( i <= mid && j<=end ){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(i = start, k=0;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }
    }
    public static void mergeSort(int arr[], int start, int end){
        
        // base case
        if(start>=end){
            return;
        }

        int mid = start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,mid,start,end);

    }
    public static void main(String[]args){
        int arr[] = {6,2,3,1,4,8};
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
 
    }
}