package yearconverter;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by Deb (debmalya.biswas25@gmail.com)
 */
public class JodaTimeConverter implements FullYearConverter {
    private static final DateTimeFormatter TWO_YEAR_FORMATTER = DateTimeFormat.forPattern("yy");

    @Override
    public int convert(String twoDigitYearString) {
        int year = LocalDate.parse(twoDigitYearString, TWO_YEAR_FORMATTER).getYear();
        return year;
    }
}
