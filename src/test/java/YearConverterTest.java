import org.junit.Before;
import org.junit.Test;
import yearconverter.FullYearConverter;
import yearconverter.JavaTimeConverter;
import yearconverter.JodaTimeConverter;

import static org.junit.Assert.assertEquals;

/**
 * Created by Deb (debmalya.biswas25@gmail.com)
 */
public class YearConverterTest {
    private FullYearConverter jodaTimeConverter;
    private FullYearConverter javaTimeConverter;

    @Before
    public void init() {
        jodaTimeConverter = new JodaTimeConverter();
        javaTimeConverter = new JavaTimeConverter();
    }

    @Test
    public void testJodaTimeConverter() {
        assertEquals(1999, jodaTimeConverter.convert("99"));
    }

    @Test
    public void testJavaTimeConverter() {
        assertEquals(1999, javaTimeConverter.convert("99"));
    }

}
