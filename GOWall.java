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
public class GOWall extends GameObject

{
    public static final int STDSIZE = 16;
    private GOBall ball;
    
    public GOWall(float x, float y, float sx, float sy, GOBall ball)
    {
        this.x = x;
        this.y = y;
        this.sx = sx;
        this.sy = sy;
        this.ball = ball;
    }
    
    @Override
    public void update()
    {
        if(Physics.checkCollisions(this, ball))
            ball.reverseY();
    }
}
