package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void 컴퓨터의_3자리_숫자를_지정할_수_있음() {
        player.setBalls(new Balls(Arrays.asList(1, 2, 3)));

        assertThat(player.getBalls()).isEqualTo(
                new Balls(Arrays.asList(1, 2, 3))
        );
    }

    @Test
    void 사용자에게_값을_입력_받아_게임결과를_출력() {
        player.setBalls(new Balls(Arrays.asList(1, 2, 3)));

        assertThat(player.game(new Balls(Arrays.asList(1, 3, 4)))).containsExactly(
                JudgeResult.STRIKE,
                JudgeResult.BALL,
                JudgeResult.NOTHING
        );
    }
}
