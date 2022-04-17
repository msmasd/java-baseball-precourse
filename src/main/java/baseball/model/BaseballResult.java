package baseball.model;

import java.util.List;

public class BaseballResult {

    private Integer strikeCount = 0;
    private Integer ballCount = 0;

    public BaseballResult(List<JudgeResult> judgeResults) {
        for (JudgeResult judgeResult : judgeResults) {
            calculate(judgeResult);
        }
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
        if (ballCount == 0 && strikeCount == 0) {
            return "낫싱";
        }

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
