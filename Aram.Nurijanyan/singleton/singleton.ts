enum Side {
    HOME, AWAY
}

enum Change {
    INCREASE, DECREASE
}

/** 
 * Score class provide the score of game.
 * Score class implements the Singleton design pattern, because 
 * the score of game is the same for everyone and should be provided from one source.
*/
class Score {
    private static _instance: Score;
    private home: number = 0;
    private away: number = 0;
    private _gameScore: string;

    private constructor() {
        if (Score._instance) {
            throw new Error("Error: Instantiation failed: Use Score.getInstance() instead of new.");
        }
        Score._instance = this;
    }

    get gameScore(): string {
        return `${this.home} - ${this.away}`;
    }

    public static getInstance(): Score {
        if (!Score._instance) {
            Score._instance = new Score();
        }
        return Score._instance;
    }

    changeScore(side: Side, change: Change) {
        if (side === Side.HOME) {
            change === Change.INCREASE ? this.home++ : this.home--;
        } else {
            change === Change.INCREASE ? this.away++ : this.away--;
        }
    }

    resetScore() {
        this.home = this.away = 0;
    }
}

window.addEventListener("load", () => {
    const score = Score.getInstance();
    console.log(score.gameScore);

    score.changeScore(Side.HOME, Change.INCREASE);
    console.log(score.gameScore);

    const score1 = Score.getInstance();
    score.changeScore(Side.HOME, Change.INCREASE);
    console.log(score1.gameScore);

    const score2 = Score.getInstance();
    score2.resetScore();
    console.log(score1.gameScore);

    score2.changeScore(Side.AWAY, Change.INCREASE);
    console.log(score.gameScore);
    console.log(score1.gameScore);
    console.log(score2.gameScore);
})