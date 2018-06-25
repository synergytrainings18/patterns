var Side;
(function (Side) {
    Side[Side["HOME"] = 0] = "HOME";
    Side[Side["AWAY"] = 1] = "AWAY";
})(Side || (Side = {}));
var Change;
(function (Change) {
    Change[Change["INCREASE"] = 0] = "INCREASE";
    Change[Change["DECREASE"] = 1] = "DECREASE";
})(Change || (Change = {}));
/**
 * Score class provide the score of game.
 * Score class implements the Singleton design pattern, because
 * the score of game is the same for everyone and should be provided from one source.
*/
var Score = (function () {
    function Score() {
        this.home = 0;
        this.away = 0;
        if (Score._instance) {
            throw new Error("Error: Instantiation failed: Use Score.getInstance() instead of new.");
        }
        Score._instance = this;
    }
    Object.defineProperty(Score.prototype, "gameScore", {
        get: function () {
            return this.home + " - " + this.away;
        },
        enumerable: true,
        configurable: true
    });
    Score.getInstance = function () {
        if (!Score._instance) {
            Score._instance = new Score();
        }
        return Score._instance;
    };
    Score.prototype.changeScore = function (side, change) {
        if (side === Side.HOME) {
            change === Change.INCREASE ? this.home++ : this.home--;
        }
        else {
            change === Change.INCREASE ? this.away++ : this.away--;
        }
    };
    Score.prototype.resetScore = function () {
        this.home = this.away = 0;
    };
    return Score;
}());
window.addEventListener("load", function () {
    var score = Score.getInstance();
    console.log(score.gameScore);
    score.changeScore(Side.HOME, Change.INCREASE);
    console.log(score.gameScore);
    var score1 = Score.getInstance();
    score.changeScore(Side.HOME, Change.INCREASE);
    console.log(score1.gameScore);
    var score2 = Score.getInstance();
    score2.resetScore();
    console.log(score1.gameScore);
    score2.changeScore(Side.AWAY, Change.INCREASE);
    console.log(score.gameScore);
    console.log(score1.gameScore);
    console.log(score2.gameScore);
});
