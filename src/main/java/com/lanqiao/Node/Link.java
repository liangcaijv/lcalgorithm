package com.lanqiao.Node;
public class Link{
    public Node head;
    
    //添加链表元素
    public void add(String data) {
        Node newnode = new Node(data);
        
        if(head==null) {
           head=newnode;
           return;
        }
        Node current = head;
        while (current.next!=null) {
            
            current=current.next;
        }
       
        current.next=newnode;
    }
    public void remove(int k) {
        if(k<0||head==null) {
            return;
        }
        Node current = head;
        Node pre=head;
        int count=1;
        while(count!=k) {
            count++;
            pre=current;
            current=current.next;
        }
       
        if(current == head) {
            head=head.next;
        }else {
            pre.next=current.next;
        }
      
     //   pre.next=current.next;
    }
    
    public void rrvs(int k) {
        Link l = new Link();
        Node current = head;
        Node pre = head;
        
        int count=1;
        int tmp = l.getSize()-k;
        
        if(k > l.getSize()) {
            return;
        }
        if(k==l.getSize()) {
            head=head.next;
        }
        if(k < l.getSize()) {
            while(count !=tmp) {
                count++;
                pre = current;
                current = current.next;
            }
           
        }
        pre.next=current.next;
       
       
            
        
       /* int tmpk=k;
        while(current !=null) {
            count++;
            current=current.next;
            k--;
        }
        if(k==0) {
            head=head.next;
        }
        if(k<0) {
            int tmp=count-(tmpk-1)-k;
            while(++k!=tmp) {
            
            }
        }*/
     
        
    }
    
/*    public void rvs(Node tmp) {
     if(tmp !=null) {
      
         if(tmp.next!=null) {
           Node linknode = tmp.next;
           rvs(linknode);
         }
         System.out.println(tmp.data);
     }else {
         return;
     }
        
    }*/
    //输出链表
    public void  print() {
        Node tmp = head;
        while(tmp !=null) {
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }
 public int getSize() {
        int size=1;
 
        Node node = this.head;
       if(node==null) {
            return 0;
        }
        while(node.next != null) {
            size++;
            node=node.next;
        }
        return size;
    }
    class Node {
        private String data;
        private Node next;
        public Node (String data) {
            this.data=data;
        }
   /*   public void display() {
          System.out.print(data+" ");
      }*/
        
    }
}

