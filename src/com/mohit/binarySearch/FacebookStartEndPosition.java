package com.mohit.binarySearch;

public class FacebookStartEndPosition {

    // leetcode question no 34
    public static void main(String[] args) {

    }
    public static int[] searchRange(int[] nums, int target) {


        int[] ans = {-1,-1};
        int start = findstartindex(nums, target, true);
        int end = findstartindex(nums, target, false);
        ans[0]= start;
        ans[1]= end;
      return  ans;
    }
    public static int findstartindex(int[] nums, int target,boolean findStartIndex) {
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
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
                ans = mid;
                if (findStartIndex) {
                    end =mid-1;
                    
                }else {
                    start = mid +1;
                }
            }
        }
      return  ans;
    }
}

