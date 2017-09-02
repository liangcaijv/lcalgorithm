package TenThread;

public class Node1 {  
    private int i = 0;  
    public int getI() {  
        return i;  
    }  
  
    public synchronized  void add() {  
        i++;  
    }  
}  
