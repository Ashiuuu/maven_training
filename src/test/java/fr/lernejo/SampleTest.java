package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    public Sample sampleTest = new Sample();

    @Test
    void opAddTest()
    {
        Assertions.assertEquals(sampleTest.op(Sample.Operation.ADD, 1, 1), 2);
    }

    @Test
    void opMultTest()
    {
        Assertions.assertEquals(sampleTest.op(Sample.Operation.MULT, 2, 3), 6);
    }

    @Test
    void factExceptionThrown()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sampleTest.fact(-1));
    }

    @Test
    void factTest()
    {
        Assertions.assertEquals(sampleTest.fact(4), 24);
    }
}
