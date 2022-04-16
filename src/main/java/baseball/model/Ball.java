package baseball.model;

import java.util.Objects;

public class Ball {

    private final Integer index;
    private final Integer number;

    public Ball(Integer index, Integer number) {
        this.index = index;
        this.number = number;
    }

    public JudgeResult judge(Ball target) {
        if (this.equals(target)) {
            return JudgeResult.STRIKE;
        }
        if (matchNumber(target)) {
            return JudgeResult.BALL;
        }
        return JudgeResult.NOTHING;
    }

    private boolean matchNumber(Ball target) {
        return Objects.equals(this.number, target.number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(index, ball.index) && Objects.equals(number, ball.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, number);
    }
}
