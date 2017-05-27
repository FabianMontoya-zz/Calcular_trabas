package paquete;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Fabian_Bogdanov
 */

public class Principal extends JFrame implements ActionListener {
    JLabel logo,titulo,texto1;
    JButton normal, fz;
    
    public Principal(){
        super ("Calculador Costos de Vehiculos");
        setLayout(null); 
        agregarlabel();
        botones();
    } 
    
    public void agregarlabel(){
        logo=new JLabel ();
        logo.setIcon(new ImageIcon(getClass().getResource("logo.png")));
        logo.setBounds(7,7,70,75);
        add(logo);
        
        titulo=new JLabel ("");
        titulo.setIcon(new ImageIcon(getClass().getResource("titulo.png")));
        titulo.setBounds(80,10,400,80);
        add(titulo);
        
        texto1=new JLabel ("Seleccione el tipo de vehiculo que desea conocer los costos:");
        texto1.setBounds (25,90,600,35);
        add(texto1);
    }
    
    public void botones(){
        normal = new JButton("Auto normal");
        normal.setBounds (70, 130, 107, 30);
        add(normal);
        normal.addActionListener(this);
        
        fz = new JButton ("Auto de FZ");
        fz.setBounds (210, 130, 107, 30);
        add(fz);
        fz.addActionListener (this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==fz){
            fz form2 = new fz();
            form2.setBounds(500, 90, 400, 200);
            form2.setSize(400, 300);
            form2.setVisible(true);
        }
        
        if (ae.getSource()==normal){
            normal form3 = new normal();
            form3.setBounds(500, 90, 400, 200);
            form3.setSize(400, 400);
            form3.setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        JFrame ventana = new Principal();
        ventana.setBounds(500, 90, 400, 400);
        ventana.setSize(400, 230);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

