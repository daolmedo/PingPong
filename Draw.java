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
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author dani
 */
public class Draw 
{

    
    public static void rect(float x, float y, float width, float height)
    {
        rect(x,y,width,height,0,null);
    }
    
    
    //private ArrayList<Texture> textures;
    //public static Texture TXT = loadTexture("cascos");
    
    public static void rect(float x, float y, float width, float height, float rot, String key)
    {
        glPushMatrix();
        
            glTranslatef(x,y,0);
            glRotatef(rot,0,0,1);
            
            glBegin(GL_QUADS);
            {
                glVertex2f(0,0);//Al ser 2D, sera 2 y al ser un float lo que
                glVertex2f(0,height);//pasamos, será f
                glVertex2f(width,height);
                glVertex2f(width,0);
            }
            glEnd();
        glPopMatrix();
    }
    
}
