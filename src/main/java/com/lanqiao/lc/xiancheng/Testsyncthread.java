package com.lanqiao.lc.xiancheng;

public class Testsyncthread {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       /**
        * 测试同步
        */
       /* SyncThread syncthread = new SyncThread();
        Thread thread1 = new  Thread(syncthread,"SyncThread1");
        Thread thread2 = new  Thread(syncthread,"SyncThread2");
        thread1.start();
        thread2.start();*/
        /**
         * 当synchronized与非synchronized访问，synchronized锁不会对非synchronized块进行阻塞
         */
      /*  Count count = new Count ();
        Thread thread1 =new Thread(count,"A");
        Thread thread2 =new Thread(count,"B");
        thread1.start();
        thread2.start();*/
        /**
         * 加锁 银行账户
         */
        Account account = new Account("zhang san", 10000.0f);
        AccountOperator accountOperator = new AccountOperator(account);

        final int THREAD_NUM = 10;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i ++) {
           threads[i] = new Thread(accountOperator, "Thread" + i);
           threads[i].start();
        }
    }

}
