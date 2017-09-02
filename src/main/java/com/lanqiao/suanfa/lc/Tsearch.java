package com.lanqiao.suanfa.lc;

public class Tsearch{
        public static void main(String [] args){
            int [] arr={1,3,5,7,8,19};  

                System.out.println("索引为： "+test(arr,8));
    
                    }
     public static int test(int [] arr,int des){
            int low=0;
            int high=arr.length-1;

            while(low<high){
                int midd=(low+high)/2;
                if(des==arr[midd]){
                    return midd;
                } 
                if(des<arr[midd]){
                    high=midd-1;
                }else{
                    low=midd+1;
                }
            }
            return -1;

        }
    }