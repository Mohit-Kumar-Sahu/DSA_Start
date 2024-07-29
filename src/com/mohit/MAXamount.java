package com.mohit;

public class MAXamount {
    public static void main(String[] args) {

    }
    // take a new column
    public static int maximumWealth(int[][] accounts){
        // person = row;
        //account = column;
        int ans  = Integer. MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                //every column of each row

                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;

            }
            
        }
     return ans;
    }
}
