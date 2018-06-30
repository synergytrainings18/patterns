var FootballPlayer = /** @class */ (function () {
    function FootballPlayer(team, number) {
        this.team = team;
        this.number = number;
        console.log("new football player " + team + "_" + number);
    }
    FootballPlayer.prototype.run = function (direction) {
        console.log("Run with direction " + direction);
    };
    FootballPlayer.prototype.shoot = function (target, force) {
        console.log(force + " shoot on target " + target);
    };
    FootballPlayer.prototype.pass = function (target, style) {
        console.log(style + " pass to target " + target);
    };
    return FootballPlayer;
}());
var FootballAcademy = /** @class */ (function () {
    function FootballAcademy() {
    }
    FootballAcademy.getFootballPlayer = function (team, number) {
        var footballer = FootballAcademy.teams[team];
        if (!footballer) {
            footballer = new FootballPlayer(team, number);
            FootballAcademy.count++;
            FootballAcademy.teams[team] = footballer;
        }
        else {
            footballer.number = number;
        }
        return footballer;
    };
    FootballAcademy.teams = {};
    FootballAcademy.count = 0;
    return FootballAcademy;
}());
window.addEventListener("load", function () {
    var count = 10000;
    var start = Math.floor(Date.now());
    for (var i = 1; i <= count; i++) {
        FootballAcademy.getFootballPlayer("TEAM", i);
    }
    var end = Math.floor(Date.now());
    console.log((end - start) / 1000 + "s - with Flyweight pattern & created " + FootballAcademy.count + " FootballPlayer object");
    // Output: 0.01s - with Flyweight pattern & created 1 FootballPlayer object
    // ***************************************************************************
    var start1 = Math.floor(Date.now());
    for (var i = 1; i <= count; i++) {
        new FootballPlayer("TEAM", i);
    }
    var end1 = Math.floor(Date.now());
    console.log((end1 - start1) / 1000 + "s - without Flyweight pattern & created " + count + " objects");
    // Output: 5.8s - without Flyweight pattern & created 10000 FootballPlayer objects
});
var Force;
(function (Force) {
    Force[Force["LOW"] = 0] = "LOW";
    Force[Force["NORMAL"] = 1] = "NORMAL";
    Force[Force["HIGH"] = 2] = "HIGH";
})(Force || (Force = {}));
var PassStyle;
(function (PassStyle) {
    PassStyle[PassStyle["BOTTOM"] = 0] = "BOTTOM";
    PassStyle[PassStyle["UP"] = 1] = "UP";
})(PassStyle || (PassStyle = {}));
