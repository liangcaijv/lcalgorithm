package com.lanqiao.lc;

public class Testlinklist {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Linklist linklist=new Linklist();
        linklist.addFirstNode(22);
        linklist.addFirstNode(19);
        linklist.add(1, 20);
        linklist.add(2, 18);
        //linklist.delete(3);
       // linklist.deleteData(18);
       // linklist.findPos(2);
       
        linklist.disPalyallNode();
       Node node=linklist.findPos(2);
        System.out.println(node.data);
        
        
    }

}
