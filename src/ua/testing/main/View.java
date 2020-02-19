package ua.testing.main;

import java.util.ArrayList;

public class View {

    public void printAttempts(ArrayList<Integer> attempts) {
        System.out.print("Your previous attempts: ");
        for (Integer i : attempts) {
            System.out.printf("%d ", i);
        }
    }

    public void printRange(int min, int max) {
        System.out.printf("Number boundaries: [%d - %d]", min, max);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

}
