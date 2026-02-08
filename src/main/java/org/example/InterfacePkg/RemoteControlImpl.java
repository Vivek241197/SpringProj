package org.example.InterfacePkg;

import java.util.Stack;

public class RemoteControlImpl {

    public static void main(String[] args) {

        String s = "bbcaac";
        int[] freq = new int[26];        // remaining count in string
         // whether char is in stack
        Stack<Character> st = new Stack<>();

        // 1️⃣ Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // 2️⃣ Process characters one by one
        for (char c : s.toCharArray()) {

            // current character is now being consumed
            freq[c - 'a']--;

            // maintain lexicographical order
            while (!st.isEmpty()
                    && st.peek() > c
                    && freq[st.peek() - 'a'] > 0) {
               st.pop();
            }

            // push current character
            st.push(c);
        }

        // 3️⃣ Build result
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        System.out.println(sb.toString());

       /* int nxt = 1;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            char b= s.charAt(i+1);
            if((c==')') || (c=='}')) System.out.println("wrong");
            if((c=='(') && (b==')') || (c=='{') && (b=='}')){
                i=i+1;
            }
        }
        System.out.println("All good");*/
    }
}
