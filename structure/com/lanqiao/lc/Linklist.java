package com.lanqiao.lc;

public class Linklist {
    public Node first; //定义头结点
    private int pos=0;  //节点的位置
    public Linklist() {
        this.first=null;
    }
  public void  addFirstNode(int data) {   //增加头结点
      Node node=new Node(data);
      node.next=first;
      first=node;
  };
  public Node deleteFirstNode() {  //删除一个头结点，并返回一个头结点
      Node temp=first;
      first=temp.next;
      return temp;
  }
  public void add(int index,int data) {    //将data插到索引index的后面
      Node node=new Node(data);
      Node current=first;         
      Node previous=first;        //循环结束时previous站在index的位置上
     while(pos!=index) {
         previous=current;
         current=current.next;
         pos++;
     }
     node.next=current;          //node是待插的位置
     previous.next=node;
     pos=0;
    // System.out.println(data);
      
  }
  public Node delete(int index) {     //删除任意位置的节点？为什么是删除index之后的节点
      Node current=first;
      Node previous=first;
      while(pos!=index) {
        pos++; 
        previous=current;
        current=current.next;
          
          
      }
      if(current==first) {
          first=first.next;
      }else {
           pos=0;
      previous.next=current.next;
      }
     
      return current;
  }
  public Node deleteData(int data) {     //根据data删除此位置上面的节点
      Node current=first;
      Node previous=first;              //记住上一个节点的值，用于previous.next=current.next
      while(current.data!=data) {
          if(current.next==null) {
              return null;
          }
          previous=current;
          current=current.next;
      }
      if(current==first) {
          first=first.next;
      }else {
          previous.next=current.next;
      }
      
      return current;
      
  }
  public Node findPos(int index) {      //根据节点查找相应的元素
      Node current=first;
      Node previous=first;
      while(pos!=index) {
          previous=current;
          current =current.next;
          pos++;
      }
      pos=0;
      return current;
  }
  public void traverse(Node node) {            //根据node的值决定从哪开始遍历
      if(node==null) {
          return;
      }
      Node current=node;
      while (current!=null) {
          System.out.print("从"+current.data+"遍历 "+current.data+" ");
          current=current.next;
      }
  }
  
  public void disPalyallNode() {
      Node current=first;
      while(current!=null) {
          current.print();
          current=current.next;
      }
      System.out.println();
  }
}
