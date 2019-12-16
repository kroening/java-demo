package com.diffblue.javademo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.diffblue.javademo.Search
 */

public class SearchTest {

    @Test
    public void containsArrayIsEmpty() {
        assertFalse(new Search().contains(new int[] { }, 1));
    }

    @Test
    public void containsArrayIsOneReturnsTrue() {
        int[] array = new int[] { 1 };
        assertTrue(new Search().contains(array, 1));
    }

    @Test
    public void containsArrayIsZero() {
        int[] array = new int[] { 0 };
        assertFalse(new Search().contains(array, 1));
    }

    @Test
    public void isNeedleInHaystackInputIsFooReturnsFalse() {
        assertFalse(new Search().isNeedleInHaystack("foo"));
    }

    @Test
    public void someNewMethodReturnsTrue() {
        assertTrue(new Search().someNewMethod());
    }
}
