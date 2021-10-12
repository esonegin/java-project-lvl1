package hexlet.code;

public class Utils {
    public static final int VALUERANGE = 100;
    public static final int OPERATIONRANGE = 3;
    public static final int ATTEMPTS = 3;
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static int getRandom(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
