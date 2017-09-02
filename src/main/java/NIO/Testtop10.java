package NIO;

public class Testtop10 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Top10("e:/test1.txt"));
        Thread t2 = new Thread(new Top10("e:/test2.txt"));
        Thread t3 = new Thread(new Top10("e:/test3.txt"));
        Thread t4 = new Thread(new Top10("e:/test4.txt"));
        Thread t5 = new Thread(new Top10("e:/test5.txt"));
        Thread t6 = new Thread(new Top10("e:/test6.txt"));
        Thread t7 = new Thread(new Top10("e:/test7.txt"));
        Thread t8 = new Thread(new Top10("e:/test8.txt"));
        Thread t9 = new Thread(new Top10("e:/test9.txt"));
        Thread t10 =new Thread(new Top10("e:/test10.txt"));  
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        
    }

    


}
