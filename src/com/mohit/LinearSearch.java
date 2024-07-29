package com.mohit;

public class LinearSearch {


    // Search in the array : return the index where the item found
    // otherwise return -1
    // means item not found

    public static void main(String[] args) {
     int[] nums = {1,33,445,67,54,6,7,79,-98,98};
     int target = -98;
 int ans=   linearSearch(nums,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr , int target){

        if (arr.length == 0 ) {

            return -1;

        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;

            }
        }

        return -1;
    }

}
