import epochconverter.EConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Deb (debmalya.biswas25@gmail.com)
 */
class EConverterUnitTest {
    private EConverter converter;

    @BeforeEach
    void init() {
        this.converter = new EConverter();
    }

    @Test
    void parseDate() {
        assertThat(this.converter.parseDate(1577894400000L))
                .isEqualTo(LocalDate.parse("2020-01-01"));
    }
}