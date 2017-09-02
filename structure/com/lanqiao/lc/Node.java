package com.lanqiao.lc;

public class Node {
    protected Node next;//指针
    protected int data;//数据域
    public Node(int data){
        this.data=data;
                
    }
    public void print() {         //显示此节点
      while(next!=null) {
          System.out.println(data);
      }
      
    }
}
