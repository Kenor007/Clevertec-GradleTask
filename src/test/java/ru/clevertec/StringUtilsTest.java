package ru.clevertec;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @DisplayName("IsPositiveNumber method with positive numbers")
    @ParameterizedTest(name = "with positive numbers")
    @ValueSource(strings = {"123", "1", "77"})
    void shouldReturnTrueIfNumberIsPositive(String str) {
        assertTrue(StringUtils.isPositiveNumber(str));
    }

    @DisplayName("IsPositiveNumber method with negative numbers")
    @ParameterizedTest(name = "with negative numbers")
    @ValueSource(strings = {"-123", "0", "-77"})
    void shouldReturnFalseIfNumberIsNegativeOrZero(String str) {
        assertFalse(StringUtils.isPositiveNumber(str));
    }

    @DisplayName("IsPositiveNumber method with NumberFormatException")
    @ParameterizedTest(name = "with NumberFormatException")
    @ValueSource(strings = {"abc", "D", "true"})
    void shouldReturnFalseIfCatchNumberFormatException(String str) {
        assertFalse(StringUtils.isPositiveNumber(str));
    }
}