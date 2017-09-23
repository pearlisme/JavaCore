package com.pearl.datastructure.searching;

public class LinearSearchDemo {

    public static void main(String args[]){

       int arr[] = {1,2,38,5,454,456,54};

       boolean result = search(arr, 514);
        System.out.println(result);
    }

    public static boolean search(int[] arr, int s) {
        for(int i =0 ; i < arr.length ; i ++){
            if(arr[i] == s){
                return true;
            }
        }
        return false;
    }

}
