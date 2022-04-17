package baseball.model;

import java.util.List;

public class Player {

    private Balls balls;

    public Balls getBalls() {
        return this.balls;
    }

    public void setBalls(Balls balls) {
        this.balls = balls;
    }

    public List<JudgeResult> game(Balls balls) {
        return this.balls.judge(balls);
    }
}
