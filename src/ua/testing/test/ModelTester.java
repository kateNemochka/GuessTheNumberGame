package ua.testing.test;

import org.junit.Test;
import ua.testing.main.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ModelTester {
    Model model = new Model();
    int randomNumber = 0;

    @Test
    public void generatedRandomNumberBounds_0_0__get0() {
        assertEquals(model.rand(0, 0), 0);
    }

    @Test
    public void generatedRandomNumberBelongsToTheDefaultRange_0_100() {
        for (int i=0; i<500; i++) {
            randomNumber = model.rand();
            assertTrue(randomNumber >= 0 && randomNumber <= 100);
        }
    }

    @Test
    public void generatedNumberIsBetween5And50() {
        for (int i=0; i<500; i++) {
            randomNumber = model.rand(5, 50);
            assertTrue(randomNumber >= 5 && randomNumber <= 50);
        }
    }

    @Test
    public void generatedValuesWithinDefaultRangeInclude0And100() {
        Set<Integer> randoms = new HashSet<Integer>();
        for (int i = 0; i < 5000; i++) {
            randoms.add(model.rand());
        }
        assertTrue(randoms.contains(0) && randoms.contains(100));
    }
}
