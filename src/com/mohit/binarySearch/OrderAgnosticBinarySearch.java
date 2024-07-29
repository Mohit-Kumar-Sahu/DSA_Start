package com.mohit.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

    }

    static int OrderAgnostic(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isACC;
        isACC = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java
         */
            int mid = start + (end - start) / 2;
            if (target == mid) {
                return mid;
            }

            if (isACC) {
                if (target < arr[mid]) {

                    end = mid - 1;
                } else if (target > arr[mid]) {

                    start = mid + 1;
                } else {
                    if (target > arr[mid]) {

                        end = mid - 1;
                    } else if (target < arr[mid]) {

                        start = mid + 1;
                    }
                }

            }

        }
        return -1;
    }
}
