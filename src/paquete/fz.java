package paquete;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Fabian_Bogdanov
 */
public class fz extends JFrame implements ActionListener{
    static JLabel anuncio, anuncio1, titulo, logo, traba, alarma, grua, pd;
    static JTextField trababox, alarmabox, gruabox, pdbox;
    static double trabaresult, alarmaresult, gruaresult, pdresult;
        
    public fz(){
        super ("Auto FZ");
        setLayout(null);
        labels();
    }  
    
    public void labels(){
        trabaresult=2000;
        alarmaresult=5000;
        gruaresult=0;
        pdresult=0;
        
        logo=new JLabel ();
        logo.setIcon(new ImageIcon(getClass().getResource("logo.png")));
        logo.setBounds(7,7,70,75);
        add(logo);
        
        titulo=new JLabel();
        titulo.setIcon(new ImageIcon(getClass().getResource("fz_titulo.png")));
        titulo.setBounds(50,30,400,80);
        add(titulo);
        
        anuncio=new JLabel("Debido a que el costo de un vehiculo fz no afecta los valores, para");
        anuncio.setBounds(7,80,400,30);
        add(anuncio);
        
        anuncio1=new JLabel("cualquier auto de FZ son los mismos valores.");
        anuncio1.setBounds(70,93,300,30);
        add(anuncio1);
        
        pd=new JLabel();
        pd.setIcon(new ImageIcon(getClass().getResource("payday.png")));
        pd.setBounds(5,135,200,30);
        add(pd);
        
        pdbox=new JTextField(""+pdresult);
        pdbox.setBounds(145,138,60,20);
        pdbox.setEnabled(false);
        add(pdbox);
        
        traba=new JLabel();
        traba.setIcon(new ImageIcon(getClass().getResource("traba.png")));
        traba.setBounds(5,165,200,30);
        add(traba);
        
        trababox=new JTextField(""+trabaresult);
        trababox.setBounds(133,168,73,20);
        trababox.setEnabled(false);
        add(trababox);
        
        alarma=new JLabel();
        alarma.setIcon(new ImageIcon(getClass().getResource("alarma.png")));
        alarma.setBounds(5,195,200,30);
        add(alarma);
        
        alarmabox=new JTextField(""+alarmaresult);
        alarmabox.setBounds(142,198,63,20);
        alarmabox.setEnabled(false);
        add(alarmabox);
        
        grua=new JLabel();
        grua.setIcon(new ImageIcon(getClass().getResource("grua.png")));
        grua.setBounds(5,225,200,30);
        add(grua);
        
        gruabox=new JTextField(""+gruaresult);
        gruabox.setBounds(126,228,79,20);
        gruabox.setEnabled(false);
        add(gruabox);
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
