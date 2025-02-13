package com.mohit.binarySearch;

public class InfiniteArray {

    // amazon


    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,8,9,0,0,0,0,0 };
     int target= 5;

        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr , int target){
         int start = 0;
         int end = 1;

        while (target > arr[end]){
            int newStart = end +1;
            end = end + (end - start +1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target , int start , int end){



        while (start <= end){
            // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java
         */
            int mid = start + (end - start )/2;

            if (target < arr[mid]) {

                end = mid-1;
            } else if (target > arr[mid]) {

                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
