package mygame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;


/**
 *
 * @author Sabrina
 */
public class stage1 extends JComponent {
    int[] wallX = new int[50];
    int[] wallY = new int[50];
    int[] wallW = new int[50];
    int[] wallH = new int[50];
    
    public void paint1(Graphics g)
    {
        //clear screen first
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        //draw walls
        for(int i = 0; i < 50; i++)
        {   
            g.fillRect(wallX[i], wallY[i], wallW[i], wallH[i]);
        }
        
    }
    
}
