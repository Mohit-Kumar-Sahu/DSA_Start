package com.mohit;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {1,33,445,67,54,6,7,79,-98,98};
        int target = -98;
        int ans=   linearSearch(nums,target,1,6);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr , int target, int  start, int end){

        if (arr.length == 0 ) {

            return -1;

        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target){
                return index;

            }
        }

        return -1;
    }
}
