package com.techreturners;

public class RomanNumeralsConverter {

    public String convert(int number) {

        if (isNumberBetweenOneAndNine(number)) {
            return getRomanNumberBetweenOneAndNine(number);
        } else if (isNumberBetweenTenAndThirty(number)) {
            return getRomanNumberBetweenTenAndThirty(number);
        } else {
            return "Invalid input"; // Provide a default value for other cases
        }
    }

    private boolean isNumberBetweenOneAndNine(int number) {
        return number >= 1 && number <= 9;
    }

    private boolean isNumberBetweenTenAndThirty(int number) {
        return number >= 10 && number <= 30;
    }

    private String getRomanNumberBetweenTenAndThirty(int number) {
        int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
        int secondDigit = Integer.parseInt(Integer.toString(number).substring(1, 2));
        String firstDigitInRomanNumeral = (firstDigit == 2) ? "XX" : (firstDigit == 3) ? "XXX" : "X";
        String secondDigitInRomanNumeral = (secondDigit != 0) ? getRomanNumberBetweenOneAndNine(secondDigit): "";
        return firstDigitInRomanNumeral + secondDigitInRomanNumeral;
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
