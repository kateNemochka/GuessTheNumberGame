package ua.testing.main;

import java.util.ArrayList;
import java.util.Random;

public class Model implements Constants {
    private int randMin;
    private int randMax;
    private int numberToGuess;
    private ArrayList<Integer> statistics = new ArrayList<>();

    public Model() {
        randMin = RAND_MIN;
        randMax = RAND_MAX;
        numberToGuess = rand();
    }

    public int getRandMin() {
        return randMin;
    }

    public void setRandMin(int randMin) {
        this.randMin = randMin;
    }

    public int getRandMax() {
        return randMax;
    }

    public void setRandMax(int randMax) {
        this.randMax = randMax;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public ArrayList<Integer> getStatistics() {
        return statistics;
    }

    public int rand() {
        return rand(Constants.RAND_MIN, Constants.RAND_MAX);
    }

    public int rand(int min, int max) {
        numberToGuess = new Random().nextInt(max - min + 1) + min;
        return numberToGuess;
    }

    public void addUserGuessNumber(int number) {
        statistics.add(number);
    }

}
