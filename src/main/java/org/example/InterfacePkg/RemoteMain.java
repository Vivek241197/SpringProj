package org.example.InterfacePkg;
import java.util.*;


public class RemoteMain {

    public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      String[] tokens = {"2","1","+","3","*"};
      for(String s:tokens){
          if(s=="+"){
              int a=st.pop();
              int b=st.pop();
              int sum=a+b;
              st.push(sum);
          }
          else if(s=="-"){
              int a=st.pop();
              int b=st.pop();
              int sum=b-a;
              st.push(sum);
          }
          if(s=="*"){
              int a=st.pop();
              int b=st.pop();
              int sum=a*b;
              st.push(sum);
          }
          else if(s=="/"){
              int a=st.pop();
              int b=st.pop();
              int sum=b/a;
              st.push(sum);
          }else if(s!="+" && s!="*" && s!="-" && s!="/"){
              st.push(Integer.parseInt(s));
          }
      }
      ListNode p = new ListNode();
        System.out.println(st.pop());
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

