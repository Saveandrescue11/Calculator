package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Reader {
    char operations;
    String a = null;
    String b = null;

    public char getOperations() {
        return operations;
    }

    public String getA() {
        return a;
    }
    public String getB() {
        return b;
    }

    public void setOperations(char operations) {
        this.operations = operations;
    }

    public void setString(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void read() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String text = read.readLine().toUpperCase(Locale.ROOT);
        String[] spText = text.split("[+\\-*/ ]+");
        String a = spText[0];
        String b = spText[1];
        setString(a, b);

        if(text.contains("+")) {
            setOperations('+');
        }
        if(text.contains("-")) {
            setOperations('-');
        }
        if(text.contains("*")) {
            setOperations('*');
        }
        if(text.contains("/")) {
            setOperations('/');
        }
    }
}
