package com.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,2,-5,15,70,108};
        int ans=findMin(arr);
        System.out.println(ans);
    }

    static int findMin(int[] arr){
        //assuming array is not null
        int min=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }

        }

        return min;
    }
}
