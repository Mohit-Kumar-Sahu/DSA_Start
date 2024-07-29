package com.mohit.binarySearch;

public class BinarySearch {
    //Take the middle element and check the element is greater than or lesser than the middle element
     // target > mid // search in right
    // target < mid // search on the left side

    // if (middle element == target)// return ans
    //if start > end // element not found
    // why binary search

    // best case if the element found in very first middle element O(1)
    // worst case O(log2N)
    /* WHY binary search the linear search searches through the entire array while the binary search searches
    * through comparisons ex- if we have array ofd one million elements the linear searches one million times
    * when the binary search searches only 19 times    */

    public static void main(String[] args) {


        int[] arr  = {9,8,7,6,5,4,3,2,1};
        int target = 9;

        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target ){

        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java
         */
            int mid = start + (end - start )/2;

            if(target ==  arr[mid]){
                return mid;
            }

            if (target < arr[mid]) {

                end = mid-1;
            } else  {

                start = mid + 1;
            }
        }
        return -1;
    }
}
