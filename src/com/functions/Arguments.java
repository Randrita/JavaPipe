package com.functions;

public class Arguments {
    public static void main(String[] args) {

        String greet=Greet("Randrita");
        System.out.println(greet);
    }

    static String Greet(String name) {
        String Message="Hello "+name;
        return Message;
    }
}
