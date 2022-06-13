package com.example.roman.numerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanNumeralsTests {

    @Test
    void should_return_proper_number() {
        Assertions.assertEquals("I", RomanNumerals.convert(1));
        Assertions.assertEquals("II", RomanNumerals.convert(2));
        Assertions.assertEquals("III", RomanNumerals.convert(3));
        Assertions.assertEquals("IV", RomanNumerals.convert(4));
        Assertions.assertEquals("V", RomanNumerals.convert(5));
        Assertions.assertEquals("VI", RomanNumerals.convert(6));
        Assertions.assertEquals("VII", RomanNumerals.convert(7));
        Assertions.assertEquals("VIII", RomanNumerals.convert(8));
        Assertions.assertEquals("IX", RomanNumerals.convert(9));
        Assertions.assertEquals("X", RomanNumerals.convert(10));
        Assertions.assertEquals("XI", RomanNumerals.convert(11));
        Assertions.assertEquals("XII", RomanNumerals.convert(12));
        Assertions.assertEquals("XIII", RomanNumerals.convert(13));
        Assertions.assertEquals("XIV", RomanNumerals.convert(14));
        Assertions.assertEquals("XV", RomanNumerals.convert(15));
        Assertions.assertEquals("XVI", RomanNumerals.convert(16));
        Assertions.assertEquals("XVII", RomanNumerals.convert(17));
        Assertions.assertEquals("XVIII", RomanNumerals.convert(18));
        Assertions.assertEquals("XIX", RomanNumerals.convert(19));
        Assertions.assertEquals("XX", RomanNumerals.convert(20));
        Assertions.assertEquals("XXI", RomanNumerals.convert(21));
        Assertions.assertEquals("XXIV", RomanNumerals.convert(24));
        Assertions.assertEquals("XXV", RomanNumerals.convert(25));
        Assertions.assertEquals("XXIX", RomanNumerals.convert(29));
        Assertions.assertEquals("XXX", RomanNumerals.convert(30));
        Assertions.assertEquals("XXXI", RomanNumerals.convert(31));
        Assertions.assertEquals("XXXIX", RomanNumerals.convert(39));
        Assertions.assertEquals("XL", RomanNumerals.convert(40));
        Assertions.assertEquals("XLI", RomanNumerals.convert(41));
        Assertions.assertEquals("XLII", RomanNumerals.convert(42));
        Assertions.assertEquals("XLIV", RomanNumerals.convert(44));
        Assertions.assertEquals("XLV", RomanNumerals.convert(45));
        Assertions.assertEquals("XLIX", RomanNumerals.convert(49));
        Assertions.assertEquals("L", RomanNumerals.convert(50));
        Assertions.assertEquals("LX", RomanNumerals.convert(60));
        Assertions.assertEquals("LXX", RomanNumerals.convert(70));
        Assertions.assertEquals("XC", RomanNumerals.convert(90));
        Assertions.assertEquals("XCIII", RomanNumerals.convert(93));
        Assertions.assertEquals("XCIV", RomanNumerals.convert(94));
        Assertions.assertEquals("XCIX", RomanNumerals.convert(99));
        Assertions.assertEquals("C", RomanNumerals.convert(100));
    }
}
