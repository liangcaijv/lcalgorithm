package com.lanqiao.lc.digui;
/**
 * 斐波那契数列
 * @author 梁偲
 *
 */
public class Fbnq {
    static int sum(int N) {
        if(N==1||N==2)
            return 1; 
        int a=sum(N-1)+sum(N-2);
        return a;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       System.out.println(sum(6)); 
    }

}
