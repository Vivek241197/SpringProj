package org.example.InterfacePkg;
import java.util.*;


public class RemoteMain {

    public static void main(String[] args) {
        int[][] p = {{1,2,3,4},
                    {3,0,7,8},
                    {9,3,4,5}};
        boolean[][] q = new boolean[p.length][p[0].length];
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[i].length;j++){
                if(p[i][j]==0){
                    q[i][j]=true;
                }
            }
        }



    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

