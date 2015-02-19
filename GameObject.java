/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.base.uncategorized;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

/**
 *
 * @author dani
 */
public abstract class GameObject 
{
    protected float x;
    protected float y;
    protected float sx;
    protected float sy;
    protected String texture;
    
    //public static Texture loadTexture()//TEXTURA
    //{
    //    try
    //    {
    //        return TextureLoader.getTexture("jpg", new FileInputStream(new File("res/" + texture + ".jpg")));
    //    } 
    //    catch (IOException ex) 
    //    {
    //        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    //    }
    //    return null;
    //}
    
    
    abstract void update();
    //public void loadTexture()
    //{
    //    Draw.loadTexture(texture);//TEXTURA
    //}
    
    public void render()
    {
        Draw.rect(x,y,sx,sy);
    }
    
    public float getX()
    {
        return x;
    }
        
    public float getY()
    {
        return y;
    }
        
    public float getSX()
    {
        return sx;
    }
        
    public float getSY()
    {
        return sy;
    }
    
    public float getCenterY()
    {
        return y + sy / 2;
    }
}
