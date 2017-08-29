package gen;

import java.util.Random;

public class RandomGenerator {

    private Random r;

    public RandomGenerator() {
        r = new Random();
    }


    /**
     * Generates a random number that is between lowBound or highBound, or between lowBound2 or highBound2
     *
     * For example, if lowBound = 0, highBound = 10, lowBound2 = 50, and highBound2 = 100,
     * number will be between 0-10 or 50-100
     *
     * @param lowBound
     * @param highBound
     * @param lowBound2
     * @param highBound2
     */
    public int genWithGap(int lowBound, int highBound, int lowBound2, int highBound2) {
        if(r.nextInt(2) == 0) return r.nextInt(highBound - lowBound) + lowBound;
        else return r.nextInt(highBound2 - lowBound2) + lowBound2;
    }
}
