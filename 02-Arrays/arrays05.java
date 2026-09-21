// leetcode 169
// using hashmap
// as we know that the element is appearing more than n/2 times if we sort the array return the mid this will be our answer

import java.util.Arrays;
import java.util.HashMap;
public class arrays05{

    // using the sorting technique
    public static int solution(int arr[]){
        // first sort the array
        // second return the mid element in the array
        // why?
        // if the array is sorted and the the majority element is occuring more than n/2 times then it must also occur at the mid in the array
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        // this is the better way to find mid than start+end/2
        // because compiler needs to create space start+end for the computation first and it is a very large space
        // after using this than it going to occupy end-start/2 space first which will be smaller and then we will add it to start

        return arr[mid];
    }// time complexity O(n logn)

    // using hashmap
    // map.put(), map.get(), map.getOrDefault()
    public static int solution2(int arr[]){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int repeatedNumber = -1;
        int repeatition = n/2;

        for(int i=0;i<n;i++){
            if(map.containsKey(i)){
                if(map.get(i)>repeatition){
                    repeatedNumber = i;
                }
            }
        }

        return repeatedNumber;
    } // time complexity O(n)

    // using frequency array
    public static int solution3(int arr[]){
        int n = arr.length;
        int frequency[] = new int[n+1];

        for(int i=0; i<n; i++){
            int num = arr[i];

            frequency[num] = frequency[num]+1;
        }

        int repeatedNumber = -1;
        int repeatition = n/2;

        for(int i=1;i<=n;i++){
            if(frequency[i]>repeatition){
                repeatedNumber = i;
            }
        }

        return repeatedNumber;

    }// time complexity O(n) but this wont pass all the test cases for eg: arr = [3,3,4]

    public static void main(String[]args){
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(solution(arr));
        System.out.println(solution2(arr));
        System.out.println(solution3(arr));

    }
}