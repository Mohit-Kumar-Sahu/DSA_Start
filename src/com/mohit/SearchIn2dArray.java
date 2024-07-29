package com.mohit;

import java.util.Arrays;

public class SearchIn2dArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,6,6,9},
                {34,55,79,5,5},
                {1,34,56,76},
                {12,39}

        };
        int target = 39;

        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] Search (int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {

            for (int column = 0; column < arr[row].length; column++) {

                if (arr[row][column] == target) {
                    return new int[]{row,column};
                }
            }
            
        }
    return new int[]{-1,-1};}
    
}
