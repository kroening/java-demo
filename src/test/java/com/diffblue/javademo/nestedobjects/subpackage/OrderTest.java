package com.diffblue.javademo.nestedobjects.subpackage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit tests for com.diffblue.javademo.nestedobjects.subpackage.Order
 */

public class OrderTest {

    @Test
    public void getItemReturnsNull() {
        assertNull(new Order().getItem());
    }

    @Test
    public void hasItemReturnsFalse() {
        assertFalse(new Order().hasItem());
    }

    @Test
    public void setItemReturnsFalse() {
        Order order = new Order();
        Item item = new Item();
        assertFalse(order.setItem(item));
        assertSame(item, order.getItem());
    }
}
