package tddKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void emptyStringShouldReturnZero() {
        String ans= StringCalculator.calculateSum("");
        assertEquals("0",ans);
    }
    @Test
    void singleNumberReturnsItselfAsSum(){
        String ans= StringCalculator.calculateSum("6");
        assertEquals("6",ans);
    }

    @Test
    void SumOfCommaSeparatedNumbers(){
        String ans= StringCalculator.calculateSum("1,2,3");
        assertEquals("6",ans);
    }
}