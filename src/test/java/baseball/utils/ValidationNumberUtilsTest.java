package baseball.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    void 세자리_숫자에서_중복된_숫자에_대한_유효성_검증() {
        ValidationNumberUtils.validateDuplicate(Arrays.asList(1, 2, 3));

        assertThatIllegalArgumentException()
                .isThrownBy(() -> ValidationNumberUtils.validateDuplicate(Arrays.asList(1, 2, 1)))
                .withMessage("cannot duplicate");
    }

    @Test
    void 세자리_숫자_크기에_대한_유효성_검증() {
        ValidationNumberUtils.validateSize(Arrays.asList(1, 2, 3));

        String exceptionMessage = "only 3 number sizes are allowed";
        assertThatIllegalArgumentException()
                .isThrownBy(() -> ValidationNumberUtils.validateSize(Arrays.asList(1, 2)))
                .withMessage(exceptionMessage);
        assertThatIllegalArgumentException()
                .isThrownBy(() -> ValidationNumberUtils.validateSize(Arrays.asList(1, 2, 3, 4)))
                .withMessage(exceptionMessage);
    }
}
