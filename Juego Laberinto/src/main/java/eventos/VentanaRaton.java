/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import javax.swing.JFrame;

/**
 *
 * @author valle
 */
public class VentanaRaton  extends JFrame{
    public Ratón panelRaton;
    public VentanaRaton(){
        setTitle("Laberinto");
        setBounds(0,0,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initcomponents(); //siempre
        
    }
    public void initcomponents(){
        panelRaton=new Ratón();
        setContentPane(panelRaton);
        panelRaton.repaint();
        //addMouseListener(panelRaton); para el clickeo y pression del raton
        addMouseMotionListener(panelRaton); //esto para el movimiento del rator
    }
}
