package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Switch {
    String [] romanian = new String [] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    Arabic arabic = new Arabic();
    Roman roman = new Roman();

    public void switching(String a, String b, char operation) {
        boolean arabics = false;
        boolean romanian = false;
        int result = 0;

        arabics = (isObjectInteger(a) && isObjectInteger(b));
        romanian = (isRomeDigits(a) && isRomeDigits(b));

        if (arabics) {
            arabic.arabicCalculation(a, b, operation);
        }
        if (romanian) {
            roman.romanCalculation(a, b, operation);
        }

    }

    public static boolean isObjectInteger(String num) {
        try {
            int i = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean isRomeDigits(String s)
    {
        return Arrays.asList(romanian).contains(s);
    }
}
