package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void 컴퓨터의_3자리_숫자를_지정할_수_있음() {
        assertThat(player.setBalls(Arrays.asList(1, 2, 3))).isEqualTo(
                new Balls(Arrays.asList(1, 2, 3))
        );
    }

    @Test
    void 컴퓨터의_3자리_숫자를_입력할_때_잘못_입력할_때_IllegalArgumentException_에러_발생() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> player.setBalls(Arrays.asList(1, 2, 3, 4)));

        assertThatIllegalArgumentException()
                .isThrownBy(() -> player.setBalls(Arrays.asList(1, 2, 2)));

        assertThatIllegalArgumentException()
                .isThrownBy(() -> player.setBalls(Arrays.asList(0, 1, 3)));
    }
}
