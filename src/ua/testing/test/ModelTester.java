package ua.testing.test;

import org.junit.Test;
import ua.testing.main.Model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ModelTester {
    Model model = new Model();

    @Test
    public void generatedRandomNumberBelongsToTheDefaultRange() {
        int randomNumber = 0;
        for (int i=0; i<500; i++) {
            randomNumber = model.rand();
            assertTrue(randomNumber >= 0 && randomNumber <= 100);
        }
    }

    @Test
    public void generatedNumberIsBetween5And50() throws Exception {
        int randomNumber = 0;
        for (int i=0; i<500; i++) {
            randomNumber = model.rand(5, 50);
            assertTrue(randomNumber >= 5 && randomNumber <= 50);
        }
    }

    /*@Test
    public void generatedNumberDoesNotBelongToWrongRange() throws Exception {
        int randomNumber = 0;
        for (int i=0; i<500; i++) {
            randomNumber = model.rand(50, 5);
            assertFalse(randomNumber >= 5 && randomNumber <= 50);
        }
    }*/
}
