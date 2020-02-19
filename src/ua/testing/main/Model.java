package ua.testing.main;

import java.util.ArrayList;
import java.util.Random;

public class Model implements ModelConstants {
    private int rangeMin;
    private int rangeMax;
    private int secretNumber;
    private ArrayList<Integer> attempts = new ArrayList<>();

    public Model() {
        rangeMin = RAND_MIN;
        rangeMax = RAND_MAX;
        secretNumber = rand();
    }

    public int getRangeMin() {
        return rangeMin;
    }

    public int getRangeMax() {
        return rangeMax;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public ArrayList<Integer> getAttempts() {
        return attempts;
    }


    public int rand() {
        return rand(ModelConstants.RAND_MIN, ModelConstants.RAND_MAX);
    }

    public int rand(int min, int max) {
        secretNumber = new Random().nextInt(max - min + 1) + min;
        return secretNumber;
    }


    public boolean isSecret(int number) {
        attempts.add(number);
        if (number == secretNumber)
            return true;
        else if (number < secretNumber)
            this.rangeMin = number;
        else
            this.rangeMax = number;
        return false;
    }

}
