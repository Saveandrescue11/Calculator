package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Roman {
    String [] roman = new String [] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public void romanCalculation(String num1, String num2, char operation) {
        int a = 0;
        int b = 0;

        try {
            Calculations calc = new Calculations();
            ArrayList<String> list = new ArrayList<>();

            for (String z : roman) list.add(z);

            a = list.indexOf(num1) + 1;
            b = list.indexOf(num2) + 1;

            int result = calc.calculator(a, b, operation);
            toArabic toarab = new toArabic();
            String r = toarab.toArab(result);
            if (!r.isEmpty()) {
                System.out.println(r);
            }


             } catch (Exception e) {
            System.exit(1);
        }
    }
}
