var game = new Phaser.Game(480, 640, Phaser.AUTO, "gd");

var splashState = new SplashState(game);
var menuState = new MenuState(game);
var playState = new PlayState(game);
var overState = new OverState(game);

game.state.add("splash_state", splashState);
game.state.add("menu_state", menuState);
game.state.add("play_state", playState);
game.state.add("over_state", overState);

game.state.start("splash_state");
