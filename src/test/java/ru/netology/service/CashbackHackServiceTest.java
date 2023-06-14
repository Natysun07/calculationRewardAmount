package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void IfAmountLess1_000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void IfAmountEqually1_001() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);


    }

    @Test
    void IfAmountEqually0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }

    @Test
    void IfAmountEqually1_000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}