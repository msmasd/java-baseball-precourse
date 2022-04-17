package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
