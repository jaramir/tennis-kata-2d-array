class TennisGame {
    private static final String[][] TENNIS_SCORE_NAMES = {
            {"love-all", "fifteen-love", "thirty-love", "forty-love"},
            {"love-fifteen", "fifteen-all", "thirty-fifteen", "forty-fifteen"},
            {"love-thirty", "fifteen-thirty", "thirty-all", "forty-thirty"},
            {"love-forty", "fifteen-forty", "thirty-forty"},
    };

    private final int player1score;
    private final int player2score;

    private TennisGame(int player1score, int player2score) {
        this.player1score = player1score;
        this.player2score = player2score;
    }

    static String score(int player1score, int player2score) {
        TennisGame game = new TennisGame(player1score, player2score);
        return game.score();
    }

    private String score() {
        if (scoreHasName())
            return scoreName();
        else if (sameScore())
            return "deuce";
        else if (isAdvantage())
            return "advantage " + playerWithMostPoints();
        else
            return "win " + playerWithMostPoints();
    }

    private boolean scoreHasName() {
        return player2score < TENNIS_SCORE_NAMES.length &&
                player1score < TENNIS_SCORE_NAMES[player2score].length;
    }

    private String scoreName() {
        return TENNIS_SCORE_NAMES[player2score][player1score];
    }

    private boolean sameScore() {
        return player1score == player2score;
    }

    private boolean isAdvantage() {
        return Math.abs(player1score - player2score) == 1;
    }

    private String playerWithMostPoints() {
        return player1score > player2score ? "player 1" : "player 2";
    }
}
