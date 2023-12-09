package org.example.dan8;

public class Solution {
    public static String[] stringToArray(String s) {

        String[] newArray = s.split(" ");
        return  newArray;
    }

    public static String smash(String... words) {
        String end = String.join(" ", words);
        return end.trim();
    }

    public static void main(String[] args) {
        String sraka = "hyjlo sraka";
        String[] rezult = stringToArray(sraka);
        for (String el : rezult){
            System.out.println(el);
        }

        String s = smash("Hello", "world", "this", "is", "great");
        System.out.println(s);
    }
}
