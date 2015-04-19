var SplashState = function(game){
    this.game = game;
    this.totalTime = 300;
    this.currentTime = 0;
};

SplashState.prototype = {
    preload:function(){
        this.currentTime = 0;
    },
    create: function(){
        this.updateScaleMode();
    },
    update:function(){
        this.checkAndChangeState();
    },
    shutdown:function(){
        this.currentTime = 0;
    },
    checkAndChangeState: function(){
        if(this.currentTime >= this.totalTime){
            this.game.state.start("menu_state");
        } else {
            this.currentTime += this.game.time.elapsed;
        }
    },
    updateScaleMode: function(){
        this.game.scale.scaleMode = Phaser.ScaleManager.SHOW_ALL;
        this.game.scale.setScreenSize(true);
        this.game.scale.refresh();
    }
};
