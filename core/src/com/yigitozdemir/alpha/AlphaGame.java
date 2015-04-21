package com.yigitozdemir.alpha;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.yigitozdemir.screenmanager.ScreenManager;
import com.yigitozdemir.screens.LostScreen;
import com.yigitozdemir.screens.MenuScreen;
import com.yigitozdemir.screens.PlayScreen;
import com.yigitozdemir.screens.SplashScreen;
import com.yigitozdemir.screens.WonScreen;

import java.util.ArrayList;
import java.util.List;

public class AlphaGame extends Game {
	ScreenManager screenManager;

	public AlphaGame(){
		screenManager = new ScreenManager(this);
		initialize();
	}

	@Override
	public void create () {
		screenManager.startGame();
	}


	private void initialize(){
		List<Screen> screenList = new ArrayList<Screen>();

		SplashScreen splashScreen = new SplashScreen();
		MenuScreen menuScreen = new MenuScreen();
		PlayScreen playScreen = new PlayScreen();
		WonScreen wonScreen = new WonScreen();
		LostScreen lostScreen = new LostScreen();

		screenList.add(splashScreen);
		screenList.add(menuScreen);
		screenList.add(playScreen);
		screenList.add(wonScreen);
		screenList.add(lostScreen);

		screenManager.setScreenList(screenList);
	}
}
