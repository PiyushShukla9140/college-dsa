// sliding window algo problem
// return the max sum of subarray of k size
// sliding window alwys works on the subarrays
// leetcode 643
// solve this type of ques using kadane too 

import java.util.*;
public class arrays03{
    // brute force approach

    static int subarray(int arr[],int k){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }

    // using sliding window
    // 
    static int maxSubArray(int arr[], int k){
        int sum = 0;
        
        // first subarray sum
        for(int i=0;i<k;i++){
            sum += arr[i];
        }

        int max = sum;

        for(int i=k;i<arr.length;i++){
            // ab second subaary ke liye pehle wale subarray ke last 2 elements common rhege
            // pehla element niklega toh minus krdo uske sum me se and ek element bahar wla add hoga 
            // 
            sum = sum - arr[i-k]+arr[i];
            max = Math.max(max,sum);
        }

        return max/k;

        
    }

    public static void main(String[]args){
        int arr[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(subarray(arr,k));
        System.out.println(maxSubArray(arr,k));

    }
}