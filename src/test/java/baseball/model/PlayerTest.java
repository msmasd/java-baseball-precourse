package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void 컴퓨터의_3자리_숫자를_지정할_수_있음() {
        player.setBalls(new Balls(Arrays.asList(1, 2, 3)));

        Assertions.assertThat(player.getBalls()).isEqualTo(
                new Balls(Arrays.asList(1, 2, 3))
        );
    }
}
