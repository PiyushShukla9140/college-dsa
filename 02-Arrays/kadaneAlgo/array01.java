// there are many test cases we are going to perform for this 
// case 1: if boht neagtive and positive elements are present in the array
// If there are only positive elements present in array then maxSum will be the sum of entire array

public class array01{
    public static int kadane(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum + arr[i];
            // currentSum += arr[i];
            if(currentSum<0){
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;

    }
    public static void main(String[]args){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        
        System.out.println(kadane(arr));
    }
}