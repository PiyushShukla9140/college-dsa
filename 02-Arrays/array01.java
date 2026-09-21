// sequentiall or linear data structure 
// same type od data ko store krta h

// there are three types of how can we define array


// learn about linear search and binary search
// linear search: ek ek element ko traverse krte h. Time comp O(N) worst case, best case O(1)
// binary search: arry should be sorted,  now find the mid if the target element is smaller search on left side and if it is greater search on the right side 
//                Time complexity: worst O(log n), best case O(1)

import java.util.*;
public class array01{
    public static boolean search(int arr[],int si, int ei, int target){
        Arrays.sort(arr);

        
        int mid = (si+ei)/2;

        if(target != mid){
            return false;
        }

        if(target<=mid){
            search(arr,si,mid,target);
        }else{
            search(arr,mid,ei,target);
        }

        return true;





    }
    public static void main(String[]args){
        int arr[] = {2,1,3,6,4,7};
        int si = arr[0];
        int n = arr.length;
        int ei = arr[n-1];
        int target = 4;
        
        if(search(arr,si,ei,target)){
            System.out.println("The target is found .");
        }else{
            System.out.println("The target is not found.");
        }

    }
}