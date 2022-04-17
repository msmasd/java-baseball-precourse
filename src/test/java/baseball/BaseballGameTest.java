package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {

    private BaseballGame baseballGame;

    @BeforeEach
    void setUp() {
        baseballGame = new BaseballGame();
    }

    @Test
    void 플레이어에게_3자리_랜덤한_숫자를_지정할_수_있음() {
        baseballGame.resetBalls();
    }

    @Test
    void 세자리_수를_받아서_게임결과를_받아볼_수_있다() {
        baseballGame.resetBalls();
        assertThat(baseballGame.game(Arrays.asList(1, 2, 3))).isNotNull();
    }
}
