package com.mohit.binarySearch;

public class MountainArray1 {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {




        int start = 0;
        int end = arr.length -1;

        while (start < end){
            // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java
         */
            int mid = start + (end - start )/2;

            if (arr[mid] > arr[mid+1]&& arr[mid]>arr[mid-1]) {


                return mid;

            }else if(arr[mid-1]<arr[mid]) {

                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return start;// or return end both are pointing to same element at the end
    }
        }


