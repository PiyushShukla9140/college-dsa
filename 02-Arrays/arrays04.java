// leetcode 268
// there are two cases when distinct numbers are there and there are no distinct number
// if distinct numbers are there then use n(n+1)/2 formula to solve this


public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }

        return nums.length;
}// time complexity O(n logn)
public static int missingNumber(int[] nums) {
        int n = nums.length;
        int nSum = ((n+1)*n)/2;// formula to find the sum of numbers till n 
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        int result = nSum-sum;
        return result;
} // time complexity O(n)