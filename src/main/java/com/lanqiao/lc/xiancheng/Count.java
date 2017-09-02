package com.lanqiao.lc.xiancheng;

import java.util.Iterator;

public class Count implements Runnable{
    private int count;
    public void getCount() {
        count=0;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("A")) {
            countAdd();
        }else if(threadName.equals("B")){
            countAdd1();
        }
    }
    //非synchronized块
    private void countAdd1() {
        // TODO Auto-generated method stub
        for(int i = 0;i<5;i++) {
            System.out.println(Thread.currentThread().getName()+"count "+count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    private void countAdd() {
        // TODO Auto-generated method stub
        synchronized(this) {
            for(int i=0;i<5;i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + count++);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
       
    }
}
