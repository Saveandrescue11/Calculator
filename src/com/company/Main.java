package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Reader read = new Reader();
        read.read();
        String a = read.getA();
        String b = read.getB();

        char operation = read.getOperations();

        Switch sw = new Switch();
        sw.switching(a, b, operation);
    }
}
