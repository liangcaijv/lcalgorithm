package TenThread;
/**
 * 变量i，10个线程分别对其加10次，最后结果应i为100。
 * @author 梁偲
 *
 */
public class ThreadTest implements Runnable {  
    private Node1 node;  
  
    public ThreadTest(Node1 node) {  
        this.node = node;  
    }  
  
    @Override  
    public void run() {  
     
           for (int i = 0; i < 10; i++) {  
            node.add();  
            System.out.println(Thread.currentThread().getName() + ": " + node.getI());  
        }  
      } 
    
  
    public static void main(String[] args) {  
        Node1 node1 = new Node1();  
        for (int i = 0; i < 10; i++) {  
            Thread thread = new Thread(new ThreadTest(node1), "thread-" + i);  
            thread.start();  
        }  
  
        try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println(node1.getI());  
    }  
}  