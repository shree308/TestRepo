package com.learning.bank.app;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegisterServiceTest {

    String name=null;

    @BeforeMethod
    public void setVariable() {
        name="Mohit";
        
    }

    @Test
    public void testValidateName() {
        Assert.assertEquals(name,"Mohit");
        Assert.assertNotNull(name);
        Assert.assertNotEquals(name,"Mohit1");
        Assert.assertSame(name,"Mohit");




    }
}
