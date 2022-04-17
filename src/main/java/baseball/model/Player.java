package baseball.model;

import baseball.utils.ValidationNumberUtils;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Balls balls;

    public Balls setBalls(List<Integer> numbers) {
        validateBalls(numbers);

        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            ballList.add(new Ball(i, numbers.get(i)));
        }
        this.balls = new Balls(ballList);

        return this.balls;
    }

    private void validateBalls(List<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException("only 3 number sizes are allowed");
        }

        ValidationNumberUtils.validateDuplicate(numbers);

        for (Integer number : numbers) {
            ValidationNumberUtils.validateRange(number);
        }
    }
}
