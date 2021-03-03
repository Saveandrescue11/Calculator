package com.company;

public class Calculations {

    public int calculator(int a, int b, char operation) {
        int result = 0;

        try {
            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '/':
                    result = a / b;
                    break;
                case '*':
                    result = a * b;
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
