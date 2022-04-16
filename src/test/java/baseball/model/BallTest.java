package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(1, 6);
    }

    @Test
    void 특정_위치에_있는_수와_자리수를_통해_스트라이크_볼_낫싱_판단() {
        assertThat(ball.judge(new Ball(1, 6))).isEqualTo(JudgeResult.STRIKE);
        assertThat(ball.judge(new Ball(2, 6))).isEqualTo(JudgeResult.BALL);
        assertThat(ball.judge(new Ball(2, 5))).isEqualTo(JudgeResult.NOTHING);
    }
}
