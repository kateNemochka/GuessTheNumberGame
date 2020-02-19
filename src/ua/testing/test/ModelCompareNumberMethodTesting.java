package ua.testing.test;

import org.junit.Test;
import ua.testing.main.Model;

import static org.junit.Assert.*;

public class ModelCompareNumberMethodTesting {
    Model model = new Model();
    int secretNumber = model.getSecretNumber();

    @Test
    public void testSameToSecretResultAndBoundaries() {
        assertTrue(model.isSecret(secretNumber));
        assertEquals(model.RAND_MIN, model.getRangeMin());
        assertEquals(model.RAND_MAX, model.getRangeMax());
    }

    @Test
    public void testBiggerThanSecretResultAndBoundaries() {
        assertTrue(!model.isSecret(secretNumber + 10));
        assertEquals(model.RAND_MIN, model.getRangeMin());
        assertEquals(secretNumber + 10, model.getRangeMax());
    }

    @Test
    public void testSmallerThanSecretResultAndBoundaries() {
        assertTrue(!model.isSecret(secretNumber - 10));
        assertEquals(secretNumber - 10, model.getRangeMin());
        assertEquals(model.RAND_MAX, model.getRangeMax());
    }

}
