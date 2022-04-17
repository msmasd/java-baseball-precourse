package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballResultTest {

    @Test
    void JudgeResults를_통해_출력결과를_생성할_수_있다() {
        assertThat(new BaseballResult(Arrays.asList(JudgeResult.STRIKE, JudgeResult.BALL, JudgeResult.NOTHING)))
                .hasToString("1볼 1스트라이크");
        assertThat(new BaseballResult(Arrays.asList(JudgeResult.NOTHING, JudgeResult.NOTHING, JudgeResult.NOTHING)))
                .hasToString("낫싱");
    }

}