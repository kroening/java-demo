package com.diffblue.javademo.nestedobjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit tests for com.diffblue.javademo.nestedobjects.User
 */

public class UserTest {

    @Test
    public void checkItemCostReturnsFalse() {
        assertFalse(new User(new com.diffblue.javademo.nestedobjects.subpackage.Order()).checkItemCost(new com.diffblue.javademo.nestedobjects.subpackage.Item()));
    }

    @Test
    public void getOrder() {
        com.diffblue.javademo.nestedobjects.subpackage.Order order = new com.diffblue.javademo.nestedobjects.subpackage.Order();
        com.diffblue.javademo.nestedobjects.subpackage.Order result = new User(order).getOrder();
        assertSame(order, result);
    }

    @Test
    public void setOrder() {
        User user = new User(new com.diffblue.javademo.nestedobjects.subpackage.Order());
        com.diffblue.javademo.nestedobjects.subpackage.Order newOrder = new com.diffblue.javademo.nestedobjects.subpackage.Order();
        User result = user.setOrder(newOrder);
        assertSame(user, result);
        assertSame(newOrder, user.getOrder());
    }
}
