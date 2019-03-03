package Assinmentchp2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class assign2Test {

    @Test
    public void interfaceTest() {

        Interface1 it = new Class1();

        String result = it.loveCars("Honda");

        Assert.assertEquals("I love this car,  Honda", result);

    }
}
