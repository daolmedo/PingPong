/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.base.uncategorized;

/**
 *
 * @author dani
 */
public class GOBall extends GameObject
{
    public static final int SIZE = 16;
    public static final float MAX_SPEEDX = 4f;
    public static final float MAX_SPEEDY = 8f;
    public static final float DAMPING = 0.05f;
    public float velX;
    public float velY;
    public float startX;
    public float startY;
    
    public GOBall(float x, float y, String texture)//TEXTURA
    {
        this.x = x;
        this.y = y;
        
        this.texture = texture; //TEXTURA
        
        startX = x;
        startY = y;
        
        this.sx = SIZE;
        this.sy = SIZE;
        
        velX = -MAX_SPEEDX;
        velY = 0;
         
    }
    
    public void resetball()
    {
        x = startX;
        y = startY;
        
        velX *= -1;
        velY = 0;
    }
    
    @Override
    public void update()
    {
        x += velX;
        y += velY;
    }
    
    public void reverseX(float center)
    {
        velX *= -1;
        velY += (getCenterY() - center) * DAMPING;
        
        if (velY > MAX_SPEEDY)
            velY = MAX_SPEEDY;
        if (velY < -MAX_SPEEDY)
            velY = -MAX_SPEEDY;
    }
    public void reverseY()
    {
        velY *= -1;
    }
}
