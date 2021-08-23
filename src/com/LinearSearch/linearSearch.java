package com.LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] num={1,2,-9,5,17,0};
        int target=5;
        int ans=linearSearch(num,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }

        //if no cases get executed means the target value isn't present there

        }

        return -1;
    }
}
