package com.techreturners;

public class RomanNumeralsConverter {

    public String convert(int number) {
        System.out.println(number >= 1 && number <= 9);

        if (isNumberBetweenOneAndNine(number)) {
            return getRomanNumberBetweenOneAndNine(number);
        } else {
            return "Invalid input"; // Provide a default value for other cases
        }
    }

    private boolean isNumberBetweenOneAndNine(int number) {
        return number >= 1 && number <= 9;
    }

    private String getRomanNumberBetweenOneAndNine(int number) {
        String result = "";
        switch (number) {
            case 1 -> result = "I";
            case 2 -> result = "II";
            case 3 -> result = "III";
            case 4 -> result = "IV";
            case 5 -> result = "V";
            case 6 -> result = "VI";
            case 7 -> result = "VII";
            case 8 -> result = "VIII";
            case 9 -> result = "IX";
            default -> System.out.println("there is no matching roman Number");
        }
        return result;
    }
}
