package com.diffblue.javademo;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.diffblue.javademo.TicTacToe
 */

public class TicTacToeTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroOneZeroZeroZeroZero() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 1, 0, 0, 0, 0 };
        assertEquals(0, new TicTacToe().checkTicTacToePosition(board));
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroOneZeroZeroZero() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0 };
        assertEquals(0, new TicTacToe().checkTicTacToePosition(board));
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroZeroOneTwoOne() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 0, 1, 2, 1 };
        assertEquals(0, new TicTacToe().checkTicTacToePosition(board));
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroZeroOneZeroZero() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 0, 1, 0, 0 };
        assertEquals(0, new TicTacToe().checkTicTacToePosition(board));
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroZeroZeroOneZero() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 0 };
        assertEquals(0, new TicTacToe().checkTicTacToePosition(board));
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroZeroZeroZeroOne() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        assertEquals(0, new TicTacToe().checkTicTacToePosition(board));
    }

    @Test
    public void checkTicTacToePositionBoardIsEmptyThrows() throws IllegalArgumentException {
        // Incorrect size of board
        thrown.expect(IllegalArgumentException.class);
        new TicTacToe().checkTicTacToePosition(new int[] { });
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroZeroZeroMinusOneOneThrows() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 0, 0, -1, 1 };
        // Invalid player
        thrown.expect(IllegalArgumentException.class);
        new TicTacToe().checkTicTacToePosition(board);
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroZeroZeroOneOneThrows() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1 };
        // One player has made too many moves
        thrown.expect(IllegalArgumentException.class);
        new TicTacToe().checkTicTacToePosition(board);
    }

    @Test
    public void checkTicTacToePositionBoardIsZeroZeroZeroZeroZeroZeroZeroTwoTwoThrows() throws IllegalArgumentException {
        int[] board = new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2 };
        // One player has made too many moves
        thrown.expect(IllegalArgumentException.class);
        new TicTacToe().checkTicTacToePosition(board);
    }
}
