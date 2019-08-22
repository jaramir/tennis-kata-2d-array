import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameShould {
    @ParameterizedTest
    @CsvSource(value = {
            "0, 0, love-all",
            "1, 0, fifteen-love",
            "2, 0, thirty-love",
            "3, 0, forty-love",
            "4, 0, win player 1",

            "0, 1, love-fifteen",
            "1, 1, fifteen-all",
            "2, 1, thirty-fifteen",
            "3, 1, forty-fifteen",
            "4, 1, win player 1",

            "0, 2, love-thirty",
            "1, 2, fifteen-thirty",
            "2, 2, thirty-all",
            "3, 2, forty-thirty",
            "4, 2, win player 1",

            "0, 3, love-forty",
            "1, 3, fifteen-forty",
            "2, 3, thirty-forty",
            "3, 3, deuce",
            "4, 3, advantage player 1",

            "0, 4, win player 2",
            "1, 4, win player 2",
            "2, 4, win player 2",
            "3, 4, advantage player 2",
            "4, 4, deuce",

            "5, 3, win player 1",
            "3, 5, win player 2",

            "16, 16, deuce",
            "17, 16, advantage player 1",
            "16, 17, advantage player 2",
            "18, 16, win player 1",
            "16, 18, win player 2"
    })
    void display_tennis_game_score(int player1score, int player2score, String displayScore) {
        assertEquals(displayScore, TennisGame.score(player1score, player2score));
    }
}
