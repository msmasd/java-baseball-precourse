package baseball.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public List<JudgeResult> judge(List<Ball> targetBalls) {
        List<JudgeResult> result = new ArrayList<>();

        for (Ball target : targetBalls) {
            result.add(judge(target));
        }

        return result;
    }

    private JudgeResult judge(Ball target) {
        Set<JudgeResult> result = new HashSet<>();

        for (Ball ball : this.balls) {
            result.add(ball.judge(target));
        }

        return calculateJudgeResult(result);
    }

    private JudgeResult calculateJudgeResult(Set<JudgeResult> judgeResults) {
        if (judgeResults.contains(JudgeResult.STRIKE)) {
            return JudgeResult.STRIKE;
        }
        if (judgeResults.contains(JudgeResult.BALL)) {
            return JudgeResult.BALL;
        }
        return JudgeResult.NOTHING;
    }
}
