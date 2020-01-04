package epochconverter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Created by Deb (debmalya.biswas25@gmail.com)
 */
public class EConverter {

    public LocalDate parseDate(long epoch) {
        return Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
