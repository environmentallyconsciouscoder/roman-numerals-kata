import com.techreturners.RomanNumeralsConverter;
import org.junit.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    final private RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void convertRandomNumbersBetweenOneAndNine() {

        //arrange

        Random rand = new Random();
        int max=9,min=1;
        int randomNum = rand.nextInt(max - min + 1) + min;

        //assert
        System.out.println(randomNum);

        switch (randomNum) {
            case 1 -> assertEquals("I", romanNumeralsConverter.convert(1));
            case 2 -> assertEquals("II", romanNumeralsConverter.convert(2));
            case 3 -> assertEquals("III", romanNumeralsConverter.convert(3));
            case 4 -> assertEquals("IV", romanNumeralsConverter.convert(4));
            case 5 -> assertEquals("V", romanNumeralsConverter.convert(5));
            case 6 -> assertEquals("VI", romanNumeralsConverter.convert(6));
            case 7 -> assertEquals("VII", romanNumeralsConverter.convert(7));
            case 8 -> assertEquals("VIII", romanNumeralsConverter.convert(8));
            case 9 -> assertEquals("IX", romanNumeralsConverter.convert(9));
            default -> System.out.println("there is no matching randomNum");
        }
    }

    @Test
    public void convertRandomNumbersBetween10And30() {

        //arrange
        int ten = 10;
        int fifteen = 15;
        int twenty = 20;
        int twentyFive = 25;
        int thirty = 30;

        //assert
        assertEquals("X", romanNumeralsConverter.convert(ten));
        assertEquals("XV", romanNumeralsConverter.convert(fifteen));
        assertEquals("XX", romanNumeralsConverter.convert(twenty));
        assertEquals("XXV", romanNumeralsConverter.convert(twentyFive));
        assertEquals("XXX", romanNumeralsConverter.convert(thirty));
    }
}
