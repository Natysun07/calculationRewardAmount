package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void IfAmountLess1_000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void IfAmountEqually1_001() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);


    }


    @Test
    public void IfAmountEqually0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void IfAmountEqually1_000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


}