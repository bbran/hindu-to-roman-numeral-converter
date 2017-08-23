// HinduToRomanNumeralConverterTests.java
package com.libertymutual.goforcode.romanNumerals.services;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.libertymutual.goforcode.romanNumerals.services.HinduToRomanNumeralConverter;

@RunWith(Parameterized.class)
public class HinduToRomanNumeralConverterTests {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
            { 1, "I"},
            { 2, "II" },
            { 3, "III" },
            { 4, "IV" },
            { 5, "V" },
            { 6, "VI" },
            { 7, "VII" },
            { 8, "VIII" },
            { 9, "IX" },
             { 10, "X" },
             { 11, "XI" },
             { 14, "XIV" },
             { 15, "XV" },
             { 16, "XVI" },
             { 19, "XIX" },
             { 20, "XX" },
             { 30, "XXX" },
             { 40, "XL", },
             { 49, "XLIX" },
             { 50, "L" },
             { 51, "LI" },
             { 59, "LIX" },
             { 60, "LX" },
             { 70, "LXX" },
             { 80, "LXXX" },
             { 90, "XC" },
             { 91, "XCI" },
             { 92, "XCII" },
             { 93, "XCIII" },
             { 94, "XCIV" },
             { 95, "XCV" },
             { 96, "XCVI" },
             { 97, "XCVII" },
             { 98, "XCVIII" },
             { 99, "XCIX" },
             { 100, "C" },
             { 101, "CI" }, // This is complete and satisfactory
             { 110, "CX" },
             { 127, "CXXVII" },
             { 144, "CXLIV" },
             { 200, "CC" },
             { 300, "CCC" },
             { 400, "CD" },
             { 500, "D" },
             { 549, "DXLIX" },
             { 600, "DC" },
             { 700, "DCC" },
             { 800, "DCCC" },
             { 900, "CM" },
             { 1000, "M" },
             { 2000, "MM" },
             { 2222, "MMCCXXII" },
             { 2345, "MMCCCXLV" },
             { 3000, "MMM" }, // This is exceeds expectations
        });
    }

    private int input;
    private String expectedOutput;

    public HinduToRomanNumeralConverterTests(int input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Test
    public void testConversion() {
        // Arrange
        HinduToRomanNumeralConverter converter = new HinduToRomanNumeralConverter();

        // Act
        String result = converter.convert(input);

        // Assert
        assertThat(result).isEqualTo(expectedOutput);
    }

}
