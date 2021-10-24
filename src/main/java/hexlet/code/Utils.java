package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static int getRandom(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
