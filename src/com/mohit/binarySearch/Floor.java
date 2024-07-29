package com.mohit.binarySearch;

public class Floor {

    // floor is the greatest number smaller than equal to target
    public static void main(String[] args) {
        int[] arr  = {1,2,4,5,7,8,9,};
        int target = 6;

        int ans = binaryFloor(arr,target);
        System.out.println(ans);
    }


    static int binaryFloor(int[] nums , int target){

        if (target > nums[0]) {

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
        return end;
    }
}
