package bonus.part_x_pure;

import java.time.Instant;

import static java.time.temporal.ChronoUnit.DAYS;

public class UsingClock {

    public static long daysElapsed(Instant since) {
        // Current time is going to change between calls
        return DAYS.between(since, Instant.now());
    }

}
