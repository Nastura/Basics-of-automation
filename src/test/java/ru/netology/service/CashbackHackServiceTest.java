package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain() {
        int actual = service.remain(1100);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameExperiment() {

        String actual1 = service.name("PEtya");
        int actual2 = Integer.parseInt(actual1);
        int expected = 5;
        Assert.assertEquals(expected, actual2);
    }


}