/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author valle
 */
public  class Panel extends JPanel implements KeyListener{
    private final Figura figura;
    public Panel(){
        setBounds(0, 0, 500, 500);
        setBackground(Color.red);
        figura=new Figura(50, 50, 100, 100);
    }
    @Override
    public void paint(Graphics lienzo){
        lienzo.clearRect(0, 0, 500, 500);
        lienzo.setColor(Color.red);
        lienzo.fillOval(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto());
        


    }

    @Override
    public void keyTyped(KeyEvent arg0) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_UP){
            figura.setY(figura.getY()-10);
        }else if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            figura.setY(figura.getY()+10);
        }else if(ke.getKeyCode()==KeyEvent.VK_LEFT){
            figura.setX(figura.getX()-10);
        }else if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
            figura.setX(figura.getX()+10);
        }
        repaint(); //Repintar
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
    }
}
