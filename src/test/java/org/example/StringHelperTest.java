package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringHelperTest {
    /**
     * Method under test: {@link StringHelper#truncateAInFirst2Positions(String)}
     */
    @Test
    void testTruncateAInFirst2Positions() {
        assertEquals("Str", (new StringHelper()).truncateAInFirst2Positions("Str"));
        assertEquals("", (new StringHelper()).truncateAInFirst2Positions("A"));
        assertEquals("", (new StringHelper()).truncateAInFirst2Positions("AA"));
        assertEquals("Str", (new StringHelper()).truncateAInFirst2Positions("AStr"));
        assertEquals("42", (new StringHelper()).truncateAInFirst2Positions("A42"));
    }

    /**
     * Method under test: {@link StringHelper#areFirstAndLastTwoCharactersTheSame(String)}
     */

}

