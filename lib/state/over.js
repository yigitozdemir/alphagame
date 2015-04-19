var OverState = function(game){
    this.game = game;
};

OverState.prototype = {
    preload: function(){

    },
    create: function(){
        this.updateScaleMode();
    },
    update: function(){

    },
    updateScaleMode: function(){
        this.game.scale.scaleMode = Phaser.ScaleManager.SHOW_ALL;
        this.game.scale.setScreenSize(true);
        this.game.scale.refresh();
    }
};
