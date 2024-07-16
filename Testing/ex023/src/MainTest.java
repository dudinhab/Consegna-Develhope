import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    private OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");


    @Test
    void getYear() {
        int result = offsetDateTime.getYear();
        Assert.assertEquals(result,2023);
    }

    @Test
    void getMonth() {
        String result = String.valueOf(offsetDateTime.getMonth());
        Assert.assertEquals(result,"MARCH");
    }

    @Test
    void getDayOfMonth() {
        int result = offsetDateTime.getDayOfMonth();
        Assert.assertEquals(result,1);
    }

    @Test
    void getDayOfWeek() {
        String result = String.valueOf(offsetDateTime.getDayOfWeek());
        Assert.assertEquals(result,"WEDNESDAY");

    }
}