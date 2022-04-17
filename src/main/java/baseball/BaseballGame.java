package baseball;

import baseball.model.Balls;
import baseball.model.BaseballResult;
import baseball.model.JudgeResult;
import baseball.model.Player;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballGame {

    private final Player player = new Player();

    public BaseballGame() {
        resetBalls(true);
    }

    public void resetBalls(Boolean isContinue) {
        if (Boolean.TRUE.equals(isContinue)) {
            player.setBalls(createBalls());
        }
    }

    public BaseballResult game(List<Integer> numbers) {
        List<JudgeResult> judgeResults = player.game(new Balls(numbers));
        return new BaseballResult(judgeResults);
    }

    private Balls createBalls() {
        List<Integer> result = new ArrayList<>();
        Set<Integer> resultSet = new HashSet<>();

        while (result.size() < 3) {
            setNumber(result, resultSet, Randoms.pickNumberInRange(1, 9));
        }

        return new Balls(result);
    }

    private void setNumber(List<Integer> result, Set<Integer> resultSet, int number) {
        if (!resultSet.contains(number)) {
            result.add(number);
            resultSet.add(number);
        }
    }
}
