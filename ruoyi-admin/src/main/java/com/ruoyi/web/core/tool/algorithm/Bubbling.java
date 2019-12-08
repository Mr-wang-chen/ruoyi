package com.ruoyi.web.core.tool.algorithm;

public class Bubbling {

    public static void main(String[] args) {

        int arr[] = {2,5,7,8,1,9,4,3,6};

      /*  for(int i=0;i<arr.length;i++){
            getMax(arr,i);
        }*/
      for(int i=0;i<arr.length;i++){
            for(int j = 1;j<arr.length;j++){
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                };
            }
        }
        for(int k = 0;k<arr.length;k++){
            System.out.println(arr[k]);
        }


    }


        static void getMax(int [] arr,int j){
            for(j = 1;j<arr.length;j++) {
               /* if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }*/
            }
    }
}
