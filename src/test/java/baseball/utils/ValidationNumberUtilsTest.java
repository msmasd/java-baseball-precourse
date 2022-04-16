package baseball.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class ValidationNumberUtilsTest {

    @Test
    void 숫자_1_부터_9_까지_범위_유효성_검증() {
        ValidationNumberUtils.validateRange(1);
        ValidationNumberUtils.validateRange(9);

        String exceptionMessage = "cannot over 9 and less 1";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> ValidationNumberUtils.validateRange(0))
                .withMessage(exceptionMessage);
        assertThatIllegalArgumentException()
                .isThrownBy(() -> ValidationNumberUtils.validateRange(10))
                .withMessage(exceptionMessage);
    }
}
