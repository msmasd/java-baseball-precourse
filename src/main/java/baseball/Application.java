package baseball;

import baseball.model.BaseballResult;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        UiService uiService = new UiService();
        BaseballGame baseballGame = new BaseballGame();

        boolean isContinue = true;

        while (isContinue) {
            isContinue = game(uiService, baseballGame);
        }
    }

    private static boolean game(UiService uiService, BaseballGame baseballGame) {
        List<Integer> numbers = uiService.game();
        BaseballResult baseballResult = baseballGame.game(numbers);
        uiService.gameResult(baseballResult);
        if (Boolean.TRUE.equals(baseballResult.isAllStrike())) {
            Boolean isContinue = uiService.gameEnd();
            baseballGame.resetBalls(isContinue);
            return isContinue;
        }
        return true;
    }
}
