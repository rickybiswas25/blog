import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yearsystem.FullYearConverter;
import yearsystem.JavaTimeConverter;
import yearsystem.JodaTimeConverter;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by Deb (debmalya.biswas25@gmail.com)
 */
public class YearConverterTest {
    private FullYearConverter jodaTimeConverter;
    private FullYearConverter javaTimeConverter;

    @BeforeEach
    public void init() {
        jodaTimeConverter = new JodaTimeConverter();
        javaTimeConverter = new JavaTimeConverter();
    }

    @Test
    public void testJodaTimeConverter() {
        assertThat(jodaTimeConverter.convert("99"))
                .isEqualTo(1999);
    }

    @Test
    public void testJavaTimeConverter() {
        assertThat(javaTimeConverter.convert("99"))
                .isEqualTo(1999);
    }
}
