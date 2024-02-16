package org.example;

public class Main {
    public static void main(String[] arg){
        String message = "Java is Great Fun!";
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char letter = message.charAt(2);
        int stringSize = message.length();
        System.out.println(message);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);
        System.out.println(stringSize);
    }
}