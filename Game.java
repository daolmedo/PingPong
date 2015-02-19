/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.base.uncategorized;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

/**
 *
 * @author dani
 */
public class Game 
{
    private ArrayList<GameObject> objects;
    private ArrayList<Texture> textures;
    private GOPlayer player;
    private GOBall ball;
    private int playerscore;
    private int enemyscore;
    
    public Game()
    {
        playerscore = 0;
        enemyscore = 0;
        
        objects = new ArrayList<GameObject>();
        
        //TEXTURA
        ball = new GOBall(Display.getWidth() / 2 - GOBall.SIZE / 2,Display.getHeight() / 2 - GOBall.SIZE / 2,"cascos");//TEXTURA
        //
        
        player = new GOPlayer(0,Display.getHeight() / 2 - GOPlayer.SIZEY / 2, ball);
        GOEnemy enemy = new GOEnemy(Display.getWidth() - GOEnemy.SIZEX, Display.getHeight() / 2 - GOPlayer.SIZEY / 2, ball);
        
        GOWall wall1 = new GOWall(0,0,Display.getWidth(),GOWall.STDSIZE,ball);
        GOWall wall2 = new GOWall(0,Display.getHeight() - GOWall.STDSIZE,Display.getWidth(),GOWall.STDSIZE,ball);
        
        objects.add(ball);
        objects.add(player);
        objects.add(enemy);

        objects.add(wall1);
        objects.add(wall2);
    }
    

    public void getInput()      
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_W) || Keyboard.isKeyDown(Keyboard.KEY_UP))
            player.move(1);
        if(Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN))
            player.move(-1);
    }
    
    public void update()        //logics
    {
        for(GameObject go: objects)
            go.update();
        
        if (ball.getX() > Display.getWidth())
        {
            ball.resetball();
            playerscore += 1;
        }
        if (ball.getX() < 0)
        {
            ball.resetball();
            enemyscore += 1;
        }    
        Display.setTitle("Player 1: " + playerscore +" Player 2: " + enemyscore);
    }    
    
    
    public void render()
    {
        for(GameObject go: objects)
            go.render();    
    }

//    public void loadtextures()
//    {
//        for(GameObject go: objects)
//            textures = (Texture)go.loadTexture();
//    }
//    
}
