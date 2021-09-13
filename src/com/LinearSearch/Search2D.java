package com.LinearSearch;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };

        int target=5;
        int[] ans= Search2DArray(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] Search2DArray(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }

            }

        }

        //if all cases have gone false
        return new int[]{-1,-1};
    }
}
