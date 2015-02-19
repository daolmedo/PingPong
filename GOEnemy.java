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
public class GOEnemy extends GameObject
{
    public static final int SIZEX = 16;
    public static final int SIZEY = 7 * SIZEX;
    
    public static final float MAX_SPEEDX = 4f;
    public static final float MAX_SPEEDY = 8f;
    public static final float SPEED = 4f;
    
    public static final float DAMPING = 0.05f;
    
    private GOBall ball;
            
    public GOEnemy(float x,float y, GOBall ball)
    {
        this.x = x;
        this.y = y;
        this.sx = SIZEX;
        this.sy = SIZEY;
        
        this.ball = ball;
    }
    
    @Override
    public void update()
    {
        if (Physics.checkCollisions(this,ball))
            ball.reverseX(getCenterY());
        
        float speed = (ball.getCenterY() - getCenterY()) * DAMPING;
        
        if (speed > MAX_SPEEDY)
            speed = MAX_SPEEDY;
        if (speed < -MAX_SPEEDY)
            speed = -MAX_SPEEDY;
        
        y += speed;
    }
}
