package com.lanqiao.suanfa.lc;

class Pritition{
/* static void swap(int [] arr,int a,int b) {
    int temp=0;
    temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
 
}*/
/* //分区
public static int quick(int [] arr,int low,int high){
    int key=arr[low];
    if(low>high)
        return 0 ;
//从后往前索引
if(low<high){
    while(arr[high]>key&&high>low)
        high--;
    
 //    swap(arr,low,high);
//从前往后索引
    while(arr[low]<key&&high>low)
        low++;
    
    swap(arr,low,high);
}
    arr[low] = key;
    return high;
    
}*/
//递归
    public static int quick(int [] arr,int low,int high) {
        int key=arr[low];
        while(low<high) {
            while(arr[high]>=key&&low<high) {
                high--;
            }
            arr[low]=arr[high];
            while(arr[low]<=key&&low<high) {
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=key;
        return low;
    }
 static void digui(int arr[],int low,int high){
    if(low<high){
    int index=quick(arr,low,high);
    digui(arr,low,index-1);
    digui(arr,index+1,high);
}

  
    
}
 
public static void main(String [] args) {
 //   Pritition pritition=new Pritition();
    int [] arr={2,8,6,9,2,3,1};
    digui(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" "); 
    }
}
}