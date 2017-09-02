package com.lanqiao.lc.digui;
/**
 * 汉诺塔经典递归
 * @author 梁偲
 *
 */
public class Hannota {
    static void countWays(int n,String source, String helper,String target) {
        if(n==1)
            System.out.println("盘 "+n+"："+source+"--->"+target);
        else {
            countWays(n-1,source,target,helper);//先将n-1个盘子放到helper上去
            System.out.println("盘 "+n+"："+source+"--->"+target);
            countWays(n-1,helper,source,target);//再将n-1个盘子从helper移到target上去
        }
   
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        countWays(3,"A","B","C");
    }

}
