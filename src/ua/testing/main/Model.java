package ua.testing.main;

import java.util.ArrayList;
import java.util.Random;

public class Model implements Constants {
    private int randMin;
    private int randMax;
    private int numToGuess;

    public Model() {
        randMin = RAND_MIN;
        randMax = RAND_MAX;
    }

    public int rand() {
        numToGuess = new Random().nextInt(RAND_MAX + 1);
        return numToGuess;
    }
    public int rand(int min, int max) throws Exception {
        if (min > max)
            throw new Exception("Wrong random number ranges: min argument should be less than max argument");
        numToGuess = new Random().nextInt(max - min + 1) + min;
        return numToGuess;
    }




}
