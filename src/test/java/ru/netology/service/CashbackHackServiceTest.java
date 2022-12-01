package ru.netology.service;

import org.junit.Test;

//import org.testng.annotations.Test;

import static org.junit.Assert.*;
//import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remain100Test() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int amount = 100;
        int result = service.remain(amount);

        assertEquals(expected, result);
    }

    @Test
    public void remain1000Test() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int result = service.remain(amount);

        assertEquals(expected, result);
    }

    @Test
    public void remain10000Test() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 10000;
        int result = service.remain(amount);

        assertEquals(expected, result);
    }
}