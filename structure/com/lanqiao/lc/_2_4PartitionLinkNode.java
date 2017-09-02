package com.lanqiao.lc;

import com.lanqiao.Node.Link;

public class _2_4PartitionLinkNode {

    public Node partition(Node pHead, int x) {
        Node leftTail = null;
        Node rightTail = null;
        Node p = pHead;
        Node leftFirst = null;
        Node rightFirst = null;
      while (p != null) {
        int pValue = p.data;
        if (pValue < x) {
          if (leftTail == null) {
            leftFirst = p;
            leftTail = p;
          } else {
            leftTail.next = p;
            leftTail = leftTail.next;
          }
        } else {
          if (rightTail == null) {
            rightFirst = p;
            rightTail = p;
          } else {
            rightTail.next = p;
            rightTail = rightTail.next;
          }
        }
        p = p.next;
      }
      if (leftFirst == null) {// 左边链表可能为空
        return rightFirst;
      }
      leftTail.next = rightFirst;
      if (rightTail != null)
        rightTail.next = null;
      return leftFirst;
    }
  }
