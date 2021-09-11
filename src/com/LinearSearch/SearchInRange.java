package com.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num={1,2,-9,5,17,0};
        int target=-9;
        int ans=searchInRange(num,target,2,4);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr,int target,int start,int end){
        for (int i = start; i <=end ; i++) {
            if (target==arr[i]){
                return i;

            }

        }
        return -1;
    }
}
