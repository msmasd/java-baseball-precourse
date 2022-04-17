package baseball.utils;

public class ValidationStringUtils {
    public static void validateEndValue(String endValue) {
        if (!"2".equals(endValue) && !"1".equals(endValue)) {
            throw new IllegalArgumentException("only end input is 1 or 2");
        }
    }
}
