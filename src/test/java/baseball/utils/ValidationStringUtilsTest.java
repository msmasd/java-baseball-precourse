package baseball.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidationStringUtilsTest {

    @Test
    void 게임종료시_다시시작하거나_종료할_때_입력할_수_있는_값은_1_또는_2_이다() {
        ValidationStringUtils.validateEndValue("1");
        ValidationStringUtils.validateEndValue("2");

        String exceptionMessage = "only end input is 1 or 2";
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> ValidationStringUtils.validateEndValue("0"))
                .withMessage(exceptionMessage);

        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> ValidationStringUtils.validateEndValue("4"))
                .withMessage(exceptionMessage);
    }
}