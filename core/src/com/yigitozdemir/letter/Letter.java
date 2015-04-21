package com.yigitozdemir.letter;

import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by yigitozdemir on 21/04/2015.
 */
public class Letter {
    char character;
    float posX, posY;
    Sprite letterSprite;

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public Sprite getLetterSprite() {
        return letterSprite;
    }

    public void setLetterSprite(Sprite letterSprite) {
        this.letterSprite = letterSprite;
    }
}
