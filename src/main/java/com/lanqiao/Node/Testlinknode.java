package com.lanqiao.Node;

public class Testlinknode {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Link link = new Link();
        link.add("a");
        link.add("b");
        link.add("c");
        link.add("d");
        link.rrvs(2);  //删除倒数第k个元素
        //link.remove(3);  //删除正数第k个元素
        link.print();

       // link.rrvs(3);
  
    }

}
