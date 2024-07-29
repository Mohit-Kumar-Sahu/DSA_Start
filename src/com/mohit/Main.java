package com.mohit;

import java.util.Arrays;

public class Main {
   /* public static void main(String[] args) {
        String str = "Mohit";
        char target = 'o';
        System.out.println(search(str,target));
    }

    static boolean search (String str,char target){

        if(str.isEmpty()){
            return  false;

        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
     int[] arr ={1,2,3,4,5,66};
     int target = 66;
        System.out.println(search(arr,target));
    }
    static int search (int[] arr, int target){
        if (arr.length == 0) {
           return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]) {
               return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Mohit";
        char target = 'o';
        System.out.println(search(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search (String str,char target){

        if(str.isEmpty()){
            return  false;

        }
        for (char ch: str.toCharArray()
             ) {
            if (target == ch) {
                return true;
            }

        }
        return false;
    }*/

    public static void main(String[] args) {

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums) {

            if(even(num)){
             count++;
            }

        }

      return  count;
    }
    static boolean even(int num ){
      int numberOfDigits = digits(num);
      return  numberOfDigits%2==0;
    }

    static int digits(int num){
        int count =0;
        while(count>0){
            count++;
            num = num/10;
        }
        return count;
    }


}
