package com.lanqiao.suanfa.lc;
import java.util.*;


/**
归并排序示例，用到了分治并递归，复杂度为n*lgn，层数为lgn，每层中循环次数为cn，c为常数
*/
public class MergeSort{
  static void sort(int[] arr){
    sort(arr,0,arr.length-1);
  }
  /*
  分成两段分别排序，然后再合并
  */
  public static void sort(int[] arr,int p,int r){
    if (p <r) {
      int q = (r+p)/2;
      sort(arr,p,q);
      // System.out.println("left..." + Arrays.toString(arr));
      sort(arr,q+1,r);
      // System.out.println("right..." + Arrays.toString(arr));
      merge(arr,p,q,r);
    }
  }
  // 规模小的情况，用插入排序算法
  static void sortUseInsertion(int[] arr,int p,int r){
    if (p <r) {
      int q = (r+p)/2;
     /* if(r-p+1<=16){  // 个数小于16 不再递归,使用插入法进行排序
        InsertionSort.sort(arr,p,r);
      }else{*/
        sort(arr,p,q);
        System.out.println("left..." + Arrays.toString(arr));
        sort(arr,q+1,r);
        System.out.println("right..." + Arrays.toString(arr));
        merge(arr,p,q,r);
 //     }
    }
  }

  /**
  假设数组的两段分别有序，pqr为下标（起始、中间和末尾），第一段p至q含q，
  第二段q至r不含q（即q+1至末尾），将两段合并为一个整体有序的数组
  **/
  static void merge(int[] arr,int p,int q,int r){
    int n1 = q-p+1;
    int n2 = r-q;
    int[] lArr = new int[n1];// 左段
    int[] rArr = new int[n2];// 右段
    // 拷贝到新数组，但准备通过比较再拷回去
    for (int i = 0;i < n1;i++ ) {
      lArr[i] = arr[p+i];
    }
    // 拷贝
    for (int j = 0;j < n2;j++ ) {
      rArr[j] = arr[q+j+1];
    }
    // 比较并按大小抓取到arr中
    int i=0,j=0;
    for (int k = p;k < r+1;k++ ) {
      if(i==n1&&j<n2){
        arr[k] = rArr[j];
        j++;
        continue;
      }
      if(j==n2&&i<n1){
        arr[k] = lArr[i];
        i++;
        continue;
      }
      if (lArr[i]<=rArr[j]) {
        arr[k] = lArr[i];
        i++;
      }else {
        arr[k] = rArr[j];
        j++;
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {8,7,6,2,9,3,8,7,2,6,8,7};
    System.out.println("begin..." + Arrays.toString(arr));
    // sort(arr);
    sortUseInsertion(arr,0,arr.length-1);
    System.out.println("final..." + Arrays.toString(arr));
  }
}