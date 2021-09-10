package com.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String x="Randrita";
        char target= 'd';
        System.out.println(stringSearch(x,target));

    }
    static boolean stringSearch(String str, char target){
        if(str.length()==0){
            return false;

        }

        for (int i = 0; i <str.length() ; i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }
        return false;
    }

}
