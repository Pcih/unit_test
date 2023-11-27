package homework.task001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {

    @Test
    void checkEvenNumber() {
        assertTrue(MainHW.evenOddNumber(4));
    }


    @Test
    void checkOddNumber() {
        assertFalse(MainHW.evenOddNumber(3));
    }

    @Test
    void checkNumberInInterval() {
        assertTrue(MainHW.numberInInterval(25));
        assertTrue(MainHW.numberInInterval(100));
    }

    @Test
    void checkNumberNotInInterval() {
        assertFalse(MainHW.numberInInterval(24));
        assertFalse(MainHW.numberInInterval(101));
    }

}
