package com.yigitozdemir.screenmanager;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import java.util.ArrayList;
import java.util.List;

public class ScreenManager{
    private int  activeScreen;
    private String message;
    private List<Screen> screenList = new ArrayList<Screen>();
    private Game game;

    /**
     *
     * @param game oyun nesnesi ile kurucu var
     */
    public ScreenManager(Game game){
        this.game = game;
    }

    public void changeScreen(int screenId){
        setActiveScreen(screenId);
        updateGameScreen();
    }

    /**
     * 0. indisli ekranla oyunu başlat
     */
    public void startGame(){
        changeScreen(0);
    }

    /**
     * Game nesnesini update etmek için çağırılacak
     */
    private void updateGameScreen(){
        game.setScreen(screenList.get(activeScreen));
    }

    /**
     * Get-set
     * @param activeScreen
     */
    public void setActiveScreen(int activeScreen){
        this.activeScreen = activeScreen;
    }
    /**
     * Get-set
     * @return
     */
    public int getActiveScreen(){
        return this.activeScreen;
    }
    /**
     * Get-set
     * @return
     */
    public List<Screen> getScreenList(){
        return this.screenList;
    }

    /**
     * Get-set
     * @param screenList
     */
    public void setScreenList(List<Screen> screenList){
        this.screenList = screenList;
    }

    @Override
    public String toString() {
        return "on "+activeScreen+" screen";
    }
}