package baseball.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationNumberUtils {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public static void validateRange(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("cannot over " + MAX_NUMBER + " and less " + MIN_NUMBER);
        }
    }

    public static void validateDuplicate(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);

        if (numbers.size() != numberSet.size()) {
            throw new IllegalArgumentException("cannot duplicate");
        }
    }
}
