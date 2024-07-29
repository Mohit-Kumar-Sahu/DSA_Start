package com.mohit.binarySearch;

public class CelingBinary {

    // celling is the smallest number greater than equal to target
    // floor is the greatest number smaller than equal to target
    public static void main(String[] args) {
        int[] arr  = {1,2,4,5,7,8,9};
        int target = 6;

        int ans = binaryCelling(arr,target);
        System.out.println(ans);
    }


    static int binaryCelling(int nums[] , int target){

        if (target > nums[nums.length-1]) {

            return -1;

        }

        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java
         */
            int mid = start + (end - start )/2;

            if (target < nums[mid]) {

                end = mid-1;
            } else if (target > nums[mid]) {

                start = mid + 1;
            }else {
                return mid;
            }

        }
        return start;
    }
}
