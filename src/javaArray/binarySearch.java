package javaArray;
//使用sort对java数组进行排序
//二分查找

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] array={-2,1,3,4,5,4,-9};
        Arrays.sort(array);
        printArray("the result is",array);
        int index=Arrays.binarySearch(array,1);
        System.out.println("the index of 1="+index);

    }
    private static void printArray(String message,int[] array){
        System.out.println(message+":[length:"+array.length+"]");
        for(int i=0;i<array.length;i++){
            if(i!=0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();

    }
}
