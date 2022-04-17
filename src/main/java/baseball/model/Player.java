package baseball.model;

import java.util.List;

public class Player {

    private Balls balls;

    public Balls setBalls(List<Integer> numbers) {
        this.balls = new Balls(numbers);
        return this.balls;
    }
}
