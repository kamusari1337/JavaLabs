package queueModelingLab;

import java.util.Random;

public class RandomGenerator {
    private static final Random random = new Random();

    public static double getRandomInRange(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}
