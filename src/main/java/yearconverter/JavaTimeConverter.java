package yearconverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

/**
 * Created by Deb (debmalya.biswas25@gmail.com)
 */
public class JavaTimeConverter implements FullYearConverter {
    private static final DateTimeFormatter TWO_YEAR_FORMATTER = new DateTimeFormatterBuilder()
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .appendValueReduced(ChronoField.YEAR, 2, 2, 1950).toFormatter();

    @Override
    public int convert(String twoDigitYearString) {
        int year = LocalDate.parse("99", TWO_YEAR_FORMATTER).getYear();
        return year;
    }
}
