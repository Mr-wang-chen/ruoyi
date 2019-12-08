package com.ruoyi.web.core.tool.algorithm;

public class Choose {

    public static void main(String[] args) {

        int arr[] = {2,5,7,8,1,9,4,3,6};
        for(int j = 0 ;j <arr.length;j++){
            int minpos = j;
            for(int i= j+1 ;i<arr.length;i++){
                if(arr[minpos]>arr[i]){
                    minpos = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minpos];
            arr[minpos] = temp;
        }

        for(int k = 0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

    }

}
