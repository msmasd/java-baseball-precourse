package baseball;

import baseball.model.BaseballResult;
import baseball.utils.ValidationStringUtils;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class UiService {

    public static final String END_VALUE = "1";

    public List<Integer> game() {
        gamePrint();
        return gameInput();
    }

    public void gameResult(BaseballResult baseballResult) {
        gameResultPrint(baseballResult);
    }

    public Boolean gameEnd() {
        return isGameContinue();
    }

    private void gamePrint() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    private List<Integer> gameInput() {
        String input = Console.readLine();
        List<Integer> result = new ArrayList<>();

        for (char c : input.toCharArray()) {
            result.add(Character.getNumericValue(c));
        }

        return result;
    }

    private void gameResultPrint(BaseballResult baseballResult) {
        System.out.println(baseballResult);
    }

    private Boolean isGameContinue() {
        gameEndPrint();

        String endValue = Console.readLine();
        ValidationStringUtils.validateEndValue(endValue);

        return END_VALUE.equals(endValue);
    }

    private void gameEndPrint() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
