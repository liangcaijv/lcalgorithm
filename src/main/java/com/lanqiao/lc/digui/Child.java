package com.lanqiao.lc.digui;
/**
 * 有个小孩上楼每次走一个阶梯或者两个阶梯或者三个阶梯，问走十个阶梯有多少种走法？
 * @author 梁偲
 *方法：递归
 */
public class Child {
    static int cWays(int N) {
        if(N<0)
            return 0;
        else if (N==0)
            return 1;
        else 
            return cWays(N-1)+cWays(N-2)+cWays(N-3);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(cWays(10));
    }

}
