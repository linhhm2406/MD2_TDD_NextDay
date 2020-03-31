import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Test 1/1/2018")
    void showNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String actual = NextDayCalculator.showNextDay(day,month,year);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test 31/1/2018")
    void showNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String actual = NextDayCalculator.showNextDay(day,month,year);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test 30/4/2018")
    void showNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String actual = NextDayCalculator.showNextDay(day,month,year);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test 28/2/2018")
    void showNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String actual = NextDayCalculator.showNextDay(day,month,year);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test 29/2/2020")
    void showNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String actual = NextDayCalculator.showNextDay(day,month,year);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test 31/12/2018")
    void showNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String actual = NextDayCalculator.showNextDay(day,month,year);
        assertEquals(expected,actual);
    }
}