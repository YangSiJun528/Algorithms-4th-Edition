package org.HelloWorld;

public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.format("Hello %s and %s\n", args[0], args[1]);
        System.out.format("Goodbye %s and %s\n", args[1], args[0]);
    }
}
