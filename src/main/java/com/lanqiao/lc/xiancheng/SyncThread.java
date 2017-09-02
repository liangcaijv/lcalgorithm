package com.lanqiao.lc.xiancheng;

 class SyncThread implements Runnable{
     public static int count;

    public SyncThread() {
        count=0;
    }
    
    public void run() {
        // TODO Auto-generated method stub
        synchronized(this) {
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName()+":"+count++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        
    }
    public int getCount() {
        return count;
    }
    
     
}
