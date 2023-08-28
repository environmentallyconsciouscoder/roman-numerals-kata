import com.techreturners.RomanNumeralsConverter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void convertOneToNumberal() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("I", romanNumeralsConverter.convert(1));
    }
}
