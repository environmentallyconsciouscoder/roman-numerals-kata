import com.techreturners.RomanNumeralsConverter;
import org.junit.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    final private RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void convert36ToRomanNumberal() {
        int num = 36;
        assertEquals("XXXVI", romanNumeralsConverter.convert(num));
    }
}
