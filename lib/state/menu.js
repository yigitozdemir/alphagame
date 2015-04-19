MenuState = function(game){
    this.game = game;
};

/**
 *
 */
MenuState.prototype = {
    preload: function(){
        this.loadAssets();
    },
    create: function(){
        this.stage.backgroundColor = "#FFFFFF";
        this.updateScaleMode();
        this.initMenu();
        this.updateMenu();
    },
    update: function(){

    },
    loadAssets: function(){
        this.game.load.image("logo", "assets/img/Logo.png");
        this.game.load.image("play_button", "assets/img/play.png");
        this.game.load.image("share_button", "assets/img/share_button.png");
        this.game.load.image("rate_button", "assets/img/rate_button.png");
        this.game.load.image("no_sound", "assets/img/no_sound.png");
        this.game.load.image("yes_sound", "assets/img/sound.png");
    },
    updateScaleMode: function(){
        this.game.scale.scaleMode = Phaser.ScaleManager.SHOW_ALL;
        this.game.scale.setScreenSize(true);
        this.game.scale.refresh();
    },
    initMenu: function(){
        this.playButton = this.game.add.button(300, 480, "play_button", this.playButtonPressed, this);
        this.shareButton = this.game.add.button(70, 450, "share_button", this.shareButtonPressed, this);
        this.rateButton = this.game.add.button(70, 530, "rate_button", this.rateButtonPressed, this);
    },
    updateMenu: function(){
        this.playButton.width = 40;
        this.playButton.height = 40;
        this.shareButton.height = 50;
        this.shareButton.width = 100;
        this.rateButton.width = 100;
        this.rateButton.height = 50;
    },
    /**
     * Play button callback
     */
    playButtonPressed: function(){
        this.game.state.start('play_state');
    },
    /**
     * Share button callback
     */
    shareButtonPressed: function(){
        
    },
    /**
     * Rate button callback
     */
    rateButtonPressed: function(){

    }
};

MenuState.prototype.constructor = MenuState;
