package com.company;

public class Arabic {

    public void arabicCalculation(String num1, String num2, char operation) {
        int a = 0;
        int b = 0;
        int result = 0;
        try {
            a = Integer.parseInt(num1);
            b = Integer.parseInt(num2);
            if (a > 0 && a <= 10) {
                if (b > 0 && b <= 10) {
                    Calculations calc = new Calculations();
                    result = calc.calculator(a, b, operation);
                    System.out.println(result);
                    }
                }
            } catch (Exception e)
        {
            System.out.println("Not arabic.");
        }
    }
}