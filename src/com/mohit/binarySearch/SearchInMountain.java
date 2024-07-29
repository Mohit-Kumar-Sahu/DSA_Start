package com.mohit.binarySearch;

public class SearchInMountain {

    public static void main(String[] args) {




    }
    /*

    public int peakIndexInMountainArray(MountainArray mountainArr) {




        int start = 0;
        int end = arr.length -1;

        while (start < end){
            // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java

            int mid = start + (end - start )/2;

            if (mountainArr.get(mid)> mountainArr.get(mid+1)) {


                end = mid;

            }else {

                start = mid+1;
            }

        }
        return start;// or return end both are pointing to same element at the end
    }

static int binarySearchAcc(MountainArray mountainArr, int target, int start , int end){


    while (start >= end){
        // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java

        int mid = start + (end - start )/2;
        int midValue = mountainArr.get(mid);
        if(target ==  midValue){
            return mid;
        }

        if (target < mountainArr.get(mid)) {

            end = mid-1;
        } else  {

            start = mid + 1;
        }
    }
    return -1;
} static int binarySearchAcc(MountainArray mountainArr, int target, int start , int end){


        while (start >= end){
            // find the middle element
         /*
         int mid = (start+end)/2; it might be possible that start + end  the exceeds the numbers of integer
         value in java

            int mid = start + (end - start )/2;
            int midValue = mountainArr.get(mid);
            if(target ==  midValue){
                return mid;
            }

            if (target > mountainArr.get(mid)) {

                end = mid-1;
            } else  {

                start = mid + 1;
            }
        }
        return -1;
    }*/

}

