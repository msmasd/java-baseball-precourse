package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class BallsTest {

    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void 세자리_수를_통해_게임결과_판단() {
        assertThat(balls.judge(new Balls(Arrays.asList(1, 3, 4))))
                .containsExactly(
                        JudgeResult.STRIKE,
                        JudgeResult.BALL,
                        JudgeResult.NOTHING
                );
    }

    @Test
    void Balls_생성시_잘못된_값_들어오면_IllegalArgumentException_에러_발생() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Balls(Arrays.asList(1, 2, 3, 4)));

        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Balls(Arrays.asList(1, 2, 2)));

        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Balls(Arrays.asList(0, 1, 3)));
    }
}
