package com.mohit;

import java.util.Scanner;

public class SearchInString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "mohit";
        char target = 'o';
        System.out.println(search(str,target));

    }

    static boolean search(String str, char target){
        if (str.length() == 0){

            return  false;
        }

        for (int index = 0; index < str.length(); index++) {
        if (target == str.charAt(index)){
            return true;
        }
        }
return false;
    }
}
