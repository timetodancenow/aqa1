package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainOver1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1400;

        int actual = cashbackHackService.remain(amount);
        int expected = 600;

        assertEquals(expected, actual);
    }
}