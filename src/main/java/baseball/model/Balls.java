package baseball.model;

import baseball.utils.ValidationNumberUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Integer> numbers) {
        validate(numbers);
        this.balls = getBalls(numbers);
    }

    public List<JudgeResult> judge(Balls balls) {
        List<JudgeResult> result = new ArrayList<>();

        for (Ball target : balls.balls) {
            result.add(judge(target));
        }

        return result;
    }

    private void validate(List<Integer> numbers) {
        ValidationNumberUtils.validateSize(numbers);
        ValidationNumberUtils.validateDuplicate(numbers);

        for (Integer number : numbers) {
            ValidationNumberUtils.validateRange(number);
        }
    }

    private List<Ball> getBalls(List<Integer> numbers) {
        List<Ball> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(new Ball(i, numbers.get(i)));
        }
        return result;
    }

    private JudgeResult judge(Ball target) {
        Set<JudgeResult> result = new HashSet<>();

        for (Ball ball : this.balls) {
            result.add(ball.judge(target));
        }

        return calculateJudgeResult(result);
    }

    private JudgeResult calculateJudgeResult(Set<JudgeResult> judgeResults) {
        if (judgeResults.contains(JudgeResult.STRIKE)) {
            return JudgeResult.STRIKE;
        }
        if (judgeResults.contains(JudgeResult.BALL)) {
            return JudgeResult.BALL;
        }
        return JudgeResult.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balls balls1 = (Balls) o;
        return Objects.equals(balls, balls1.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}
