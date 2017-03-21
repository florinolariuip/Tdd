import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathServiceTest {
    // a year is a leap year if is divisible by 4
    // but, years divisible by 100 are not leap years
    // except years divisible by 400

    @Test
    public void leap_year_should_be_divisible_by_four(){
        assertTrue(MathService.isLeapYear(2016));
    }

    @Test
    public void non_leap_year_should_not_be_divisible_by_four(){
        assertFalse(MathService.isLeapYear(3));
    }

    @Test
    public void years_divisible_by_100_are_not_leap_years() {
        assertFalse(MathService.isLeapYear(1900));
    }

    @Test
    public void years_divisible_by_400_are_leap_years() {
        assertTrue(MathService.isLeapYear(2000));
    }


}
