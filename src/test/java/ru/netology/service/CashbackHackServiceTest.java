package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);


    }
}