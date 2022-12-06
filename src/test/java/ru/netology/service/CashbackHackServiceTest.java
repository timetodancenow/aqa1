package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainOver1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1400;

        int actual = cashbackHackService.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }
}