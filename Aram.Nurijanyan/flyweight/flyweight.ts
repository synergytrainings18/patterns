interface Actions {
    run(direction: Coords);
    shoot(target: Coords, force: Force);
    pass(target: Coords, style: PassStyle);
}

class FootballPlayer implements Actions {
    private team: string;
    number: number;

    constructor(team: string, number: number) {
        this.team = team;
        this.number = number;
        console.log(`new football player ${team}_${number}`);
    }

    run(direction: Coords) {
        console.log(`Run with direction ${direction}`);
    }

    shoot(target: Coords, force: Force) {
        console.log(`${force} shoot on target ${target}`);
    }

    pass(target: Coords, style: PassStyle) {
        console.log(`${style} pass to target ${target}`);
    }
}

class FootballAcademy {
    private static teams: {[team: string]: FootballPlayer} = {};
    static count: number = 0;

    public static getFootballPlayer(team : string, number: number) {
        let footballer = FootballAcademy.teams[team];

        if(!footballer) {
            footballer = new FootballPlayer(team, number);
            FootballAcademy.count++;
            FootballAcademy.teams[team] = footballer;
        } else {
            footballer.number = number;
        }

        return footballer;
    }
}

window.addEventListener("load", () => {
    const count: number = 10000;
    const start = Math.floor(Date.now());
    for(let i = 1; i <= count; i++) {
        FootballAcademy.getFootballPlayer("TEAM", i);
    }
    const end = Math.floor(Date.now());
    console.log(`${(end-start)/1000}s - with Flyweight pattern & created ${FootballAcademy.count} FootballPlayer object`);
    // Output: 0.01s - with Flyweight pattern & created 1 FootballPlayer object

// ***************************************************************************

    const start1 = Math.floor(Date.now()); 
    for(let i = 1; i <= count; i++) {
       new FootballPlayer("TEAM", i);
    }
    const end1 = Math.floor(Date.now());
    console.log(`${(end1-start1)/1000}s - without Flyweight pattern & created ${count} objects`);
    // Output: 5.8s - without Flyweight pattern & created 10000 FootballPlayer objects
});


interface Coords {
    x: number;
    y: number;
}

enum Force {
    LOW, NORMAL, HIGH
}

enum PassStyle {
    BOTTOM, UP
}