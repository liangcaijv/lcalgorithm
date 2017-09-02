package com.lanqiao.suanfa.lc;
import java.util.*;


/**
插入排序算法
*/
public class InsertionSort{
  static void sort(int[] arr){
    sort(arr,0,arr.length-1);
  }
  public static void sort(int[] arr,int left,int right){
    for (int j = left+1; j<=right ; j++) {
      int key = arr[j];
      int pre = j - 1;
      while(pre>=left&&arr[pre]>key){
        arr[pre+1] = arr[pre];
        pre--;
      }
      arr[pre+1] = key;
    }
  }
  static void sortInverse(int[] arr,int left,int right){
    for (int j = left+1; j<= right ; j++) {
      int key = arr[j];
      int i = j - 1;
      while(i>=left&&arr[i]<key){
        arr[i+1] = arr[i];
        i--;
      }
      arr[i+1] = key;
    }
  }
  public static void main(String[] args) {
    int[] arr = Util.getRandomArr(20,1,100);
    System.out.println("begin..." + Arrays.toString(arr));
    sort(arr);
    System.out.println("final..." + Arrays.toString(arr));
  }
}