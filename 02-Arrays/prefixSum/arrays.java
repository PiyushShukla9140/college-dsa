public class arrays{
    // this method is the optimzed version of apna college prefix sum method
    public static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;

        // Create prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Check every subarray of size k
        for (int i = 0; i <= n-k; i++) {
            // yeh joh loop condition h voh batyaeg ke start pointer 0 index se kaha tk jaayega
            // i humara starting pointer h

            int j = i + k - 1; // end pointer to pfind the last element of sun array
            int sum;
            if (i == 0) {
                sum = prefix[j];
            } else {
                sum = prefix[j] - prefix[i - 1];
                // prefix[end]-prefix[start-1];
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    // apna college prefix sum method 
    
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSubarraySum(arr, k));
    }
}