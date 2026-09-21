// case 2: if the array has all negative elements
// then just add two more variables 
// first one a boolean variable to check the array elements whether they are all negative or not
// second one to return the max element int the array

// here the current sum will always be 0, therefore return the max element of that array
public class array02{
    public static void kadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        int currentSum = 0;
        boolean allNegative = true;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum + arr[i];
            // currentSum += arr[i];
            if(currentSum<0){
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
            if(arr[i]>=0){
                allNegative=false;
            }
            maxElement = Math.max(maxElement,arr[i]);
        }
        if(allNegative=true){
            System.out.println("Max sum: "+maxElement);
        }else{
            System.out.println("Max sum: "+maxElement);
        }


    }
    public static void main(String[]args){
        int arr[] = {-2,-6,-4,-8,-9};
        kadane(arr);
    }
}