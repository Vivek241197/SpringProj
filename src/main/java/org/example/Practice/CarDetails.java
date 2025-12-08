package org.example.Practice;

import java.util.ArrayList;
import java.util.*;

public class CarDetails {

    public static void main(String[] args){
        String s = "abc";
        String cur="";
        List<String> result = new ArrayList<>();
        backTrack(s,0,cur,result);
        for(String b:result){
            System.out.println(b);
        }
    }
    static void backTrack(String s,int index,String current,List<String> rs){
        if(index==3){
                rs.add(current);
                return;
            }
            backTrack(s,index+1,current+s.charAt(index),rs);

            backTrack(s,index+1,current,rs);
        }
    }

