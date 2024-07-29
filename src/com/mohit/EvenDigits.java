package com.mohit;

public class EvenDigits {

    public static void main(String[] args) {
     int[] nums = {18,124,9,1764,98,1};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
    int count = 0;

        for (int num : nums) {
            if (even(num)){
                count++;
            }
            
        }
        return count;
    }

    //function to check the digit is even or not

    //count the length of digit
    // convert it into string and take length of it
     static boolean even(int num) {
     int numberOfDigits =  digits(num);

return numberOfDigits %2 == 0;
     }

     static  int digits(int num){
        return (int)(Math.log10(num)) +1 ;
    }
     static int digits2(int num){
        int count = 0;
         while(num > 0 ){
             count++;
             num= num/10;
     }
     return count;
    }


}
