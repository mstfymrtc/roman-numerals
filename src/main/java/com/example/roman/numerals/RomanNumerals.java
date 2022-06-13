package com.example.roman.numerals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {
    public static String convert(int input) {
        if (input == 4) return "IV";
        if (input == 9) return "IX";

        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(5,"V");

        String result = "";

        for (var entry : map.entrySet()) {
            if(input >= entry.getKey()){
                result += entry.getValue();
                input -= entry.getKey();
                return result + convert(input);
            }
        }

        for (int i = 1; i <= input; i++) {
            result += "I";
        }

        return result;
    }
}
