// leetcode 2965
// first by hashmap then
// by frequency array

import java.util.HashMap;
import java.util.*;
public class arrays06{
    // first we will do it by using hashmap
    public static int[] solution(int arr[][]){
        HashMap<Integer , Integer> map = new HashMap<>();
        // how to store data from an array into hashmap or how do we use it as frequency counter for each elemetn in 2d array

        // for (int num : arr) {
        //     // if (map.containsKey(num)) {
        //     //     map.put(num, map.get(num) + 1);
        //     // } else {
        //     //     map.put(num, 1);
        //     // } this was the traditoinal to do it

        //     map.put(num,map.getOrDefault(num,0)+1);
        //     // num will be the key from the array and 
        //     // getOrDefault is function which gets the current value of num key and it it is not there then sets the default value there itself
        //     // +1 is used to increase the frequency


        // } This was single array but this question contains grid whixh is 2d array

        int n = arr.length;// for row count
        //int n2 = arr[0].length;// for column length

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num = arr[i][j];

                map.put(num,map.getOrDefault(num,0)+1);
            }
        }// or you can convert this 2d array in 1d array as row and column boht are n and then store it into hashmap


        int repeated = -1;
        int missing = -1;


        // as we are storing in the grid and in grid we have numbers equal to rows * columns, so hashmap size will be rows*columns
        // hashmap me key(num) 1 se store hui h 
        for(int num = 1; num <= n*n; num++){
            if(map.containsKey(num)){
                if(map.get(num) == 2){
                    repeated = num;
                }
            }else{
                missing = num;
            }

        }

        return new int[]{repeated,missing};
    }

    // now by using frequency array
    public static int[] solution2(int[][] grid) {

        int n = grid.length;

        // what is frequency array?
        // Each number in the grid or given array is considered as index in the new array(frequency array)
        // default value is always 0 at each index in a array
        // Each time a number occurs in grid, we increament the value at that index in the frequency array

        // frequency array
        int[] frequency = new int[n * n + 1];
        // because we want to use each number of grid as index in frequency array and the grid size is 9
        // so in frequency 0 index willl remain unused and the size of that frequency array should be 10


        // in array by default any index value is 0

        // Count frequency of every number
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                int num = grid[i][j];

                frequency[num]++;
                // this line means frequency[nums] = frequency[nums]+1
            }
        }

        int repeated = -1;
        int missing = -1;

        // Numbers should be from 1 to n²
        for(int i = 1; i <= n * n; i++) {

            if(frequency[i] == 2) {
                repeated = i;
            }

            if(frequency[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }

    public static void main(String[]args){
        int grid[][] = {{9,1,7},{8,9,2},{3,4,6}};
        System.out.println(Arrays.toString(solution(grid)));
        System.out.println(Arrays.toString(solution2(grid)));

        //Time complexity for boht the solution is 0(nsquare)
        // Why?
        // grid contains n*n elements and we are traversing each and every element in grid once
        


    }
}