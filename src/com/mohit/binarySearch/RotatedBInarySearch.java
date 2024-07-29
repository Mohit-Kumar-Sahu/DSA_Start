package com.mohit.binarySearch;

public class RotatedBInarySearch {

    public static void main(String[] args) {

    }
    // We can do this simply by doing in recursion in one method instead of using three methods.


        public int search(int[] nums, int target) {
            int pivot = findPivot(nums);

            // If no pivot found, then array is not rotated
            if (pivot == -1) {
                return binarySearch(nums, target, 0, nums.length - 1);
            }

            // If pivot is found, you have found the two asc sorted arrays
            if (nums[pivot] == target) {
                return pivot;
            }
            if (target >= nums[0]) {
                return binarySearch(nums, target, 0, pivot - 1);
            }

            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

        private int binarySearch(int[] arr, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
         // this may not work for duplicate values
        private int findPivot(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Check if mid is pivoted
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }

                // Decide the side to choose
                if (arr[mid] >= arr[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }

 //  for duplicate values
        private int findPivotDuplicate(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Check if mid is pivoted
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
                // if the elements at start , end , middle are same than ignore the duplicate values
                // Decide the side to choose
                if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                    if (arr[mid] <= arr[mid+1]) {
                     return  start;
                    }
                    start++;
                    if (arr[mid] <= arr[mid-1]) {
                        return  end ;
                    }
                    end++;

                } else if (arr[start]< arr[mid]|| arr[start]== arr[mid]&& arr[mid]> arr[end]  ) {
                    start = mid+1;
                    
                } else  {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }


