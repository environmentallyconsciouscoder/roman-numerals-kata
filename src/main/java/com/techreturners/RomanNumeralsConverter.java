package com.techreturners;

import java.util.*;

public class RomanNumeralsConverter {

    private static final List<Integer> decimalValue = Arrays.asList(
            1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
    );

    private static final List<String> romanNumeral = Arrays.asList(
            "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"
    );

    public String convert(int number) {

        int decimalNumber = number;
        ArrayList<Integer> highestDecimalValueList = new ArrayList<>();

        while (decimalNumber > 0) {
            int highestDecimalValue = findHighestDecimalValue(decimalNumber);
            highestDecimalValueList.add(highestDecimalValue);
            decimalNumber -= highestDecimalValue;
        }

        System.out.println(highestDecimalValueList);
        ArrayList<String> highestRomanNumeralList = findRomanNumeral(highestDecimalValueList);
        System.out.println(highestRomanNumeralList);
        String joinedStrings = String.join("", highestRomanNumeralList);
        System.out.println(joinedStrings);

        return joinedStrings;

    }

    private ArrayList<String> findRomanNumeral(ArrayList<Integer> highestDecimalValueList) {
        ArrayList<String> highestRomanNumberalList = new ArrayList<>();

        for (Object val : highestDecimalValueList) {
            String numberString = String.valueOf(val);
            int number = Integer.parseInt(numberString);
            int index = decimalValue.indexOf(number);
            highestRomanNumberalList.add(romanNumeral.get(index));
        }
        return highestRomanNumberalList;
    }

    private int findHighestDecimalValue(int number) {
        int middleDecimalValue = decimalValue.get(6);

        // does number exists in list
        if (decimalValue.contains(number)) {
            return number;
        } else if (number > 1000) {
            return 1000;
        } else {

            // number is greater than 50
            if (number > middleDecimalValue) {
                for (int i = 6; i <= decimalValue.size() - 1; i++) {
                    if (number < decimalValue.get(i)) {
                        return decimalValue.get(i - 1);
                    }
                }

                // number is less than 50
            } else if (number < middleDecimalValue) {
                for (int i = 6; i >= 0; i--) {
                    if (number > decimalValue.get(i)) {
                        return decimalValue.get(i);
                    }
                }

            }
        }
        return 0;
    };

}
