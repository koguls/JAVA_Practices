package com.hubberspot.algorithns.arry;
public class Dforloop{

    public void printarray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print();

        
    }



    public static void main(String args[]){
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.printarray(new int[] {1,2,3,4,5,6,7});

    }
}