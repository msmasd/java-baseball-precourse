package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BallsTest {

    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(
                new Ball(0, 1),
                new Ball(1, 2),
                new Ball(2, 3)
        ));
    }

    @Test
    void 세자리_수를_통해_게임결과_판단() {
        Assertions.assertThat(balls.judge(Arrays.asList(
                new Ball(0, 1),
                new Ball(1, 3),
                new Ball(2, 4)
        ))).containsExactly(
                JudgeResult.STRIKE,
                JudgeResult.BALL,
                JudgeResult.NOTHING
        );
    }
}
