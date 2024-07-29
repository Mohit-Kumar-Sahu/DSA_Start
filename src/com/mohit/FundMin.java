package com.mohit;

import java.util.Arrays;

public class FundMin {
    public static void main(String[] args) {
        int[] nums = {22,33,445,67,54,6,7,79,-98,98};
        System.out.println(min(nums));

    }

    static int min (int[] arr){
        int ans = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (ans > arr[i]) {
             arr[i] = ans;
                return i;
            }

        }
        return ans;
   }
}
