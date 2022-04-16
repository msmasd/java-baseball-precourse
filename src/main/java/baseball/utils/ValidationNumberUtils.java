package baseball.utils;

public class ValidationNumberUtils {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public static void validateRange(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("cannot over " + MAX_NUMBER + " and less " + MIN_NUMBER);
        }
    }
}
