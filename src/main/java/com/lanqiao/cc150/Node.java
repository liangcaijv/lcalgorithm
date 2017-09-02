package com.lanqiao.cc150;

public class Node {
        String val;
        Node next=null;
        public Node(String val) {
            this.val=val;
        }
        public String toString () {
            StringBuilder sb=new StringBuilder(val+"");
            Node tm = next;
            if(tm.next==null) {
                
            }
            while(tm.next!=null) {
                sb.append(tm.val);
                tm=tm.next;
            }
            return sb.toString();
        }
}

class Findlinknode{
    
}