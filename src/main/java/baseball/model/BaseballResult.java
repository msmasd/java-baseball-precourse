package baseball.model;

import java.util.List;

public class BaseballResult {

    public static final int ALL_STRIKE_COUNT = 3;
    private Integer strikeCount = 0;
    private Integer ballCount = 0;

    public BaseballResult(List<JudgeResult> judgeResults) {
        for (JudgeResult judgeResult : judgeResults) {
            calculate(judgeResult);
        }
    }

    public Boolean isAllStrike() {
        return strikeCount == ALL_STRIKE_COUNT;
    }

    private void calculate(JudgeResult judgeResult) {
        if (judgeResult == JudgeResult.STRIKE) {
            strikeCount++;
        }
        if (judgeResult == JudgeResult.BALL) {
            ballCount++;
        }
    }

    @Override
    public String toString() {
        if (ballCount == 0 && strikeCount == 0) return "낫싱";

        StringBuilder result = new StringBuilder();
        if (ballCount > 0) {
            result.append(ballCount).append("볼 ");
        }
        if (strikeCount > 0) {
            result.append(strikeCount).append("스트라이크 ");
        }
        return result.toString().trim();
    }
}
