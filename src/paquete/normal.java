package paquete;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Fabian_Bogdanov
 */

public class normal extends JFrame implements ActionListener{
    static JLabel anuncio, anuncio1, titulo, logo, traba, alarma, grua, pd, auto;
    static JTextField trababox, alarmabox, gruabox, pdbox, autobox;
    static int trabaresult=0, alarmaresult=0, gruaresult=0, pdresult=0, costo=0;
    static JButton calcular;
        
    public normal(){
        super ("Auto Normal");
        setLayout(null);
        labels();
        boton();
    }  
    
    public void labels(){
        
        
        logo=new JLabel ();
        logo.setIcon(new ImageIcon(getClass().getResource("logo.png")));
        logo.setBounds(7,7,70,75);
        add(logo);
        
        titulo=new JLabel();
        titulo.setIcon(new ImageIcon(getClass().getResource("normal_titulo.png")));
        titulo.setBounds(70,10,400,80);
        add(titulo);
        
        anuncio=new JLabel("Digite el costo total del vehiculo sin puntos ni comas, luego pulse");
        anuncio.setBounds(10,85,400,30);
        add(anuncio);
        
        anuncio1=new JLabel("el botón 'Calcular' para ver los resultados.");
        anuncio1.setBounds(80,98,300,30);
        add(anuncio1);
        
        auto=new JLabel();
        auto.setIcon(new ImageIcon(getClass().getResource("costo.png")));
        auto.setBounds(5,135,200,30);
        add(auto);
        
        autobox=new JTextField("");
        autobox.setBounds(190,140,60,20);
        autobox.setEnabled(true);
        add(autobox);
        
        pd=new JLabel();
        pd.setIcon(new ImageIcon(getClass().getResource("payday.png")));
        pd.setBounds(5,185,200,30);
        add(pd);
        
        pdbox=new JTextField(""+pdresult);
        pdbox.setBounds(145,188,60,20);
        pdbox.setEnabled(false);
        add(pdbox);
        
        traba=new JLabel();
        traba.setIcon(new ImageIcon(getClass().getResource("traba.png")));
        traba.setBounds(5,215,200,30);
        add(traba);
        
        trababox=new JTextField(""+trabaresult);
        trababox.setBounds(133,218,73,20);
        trababox.setEnabled(false);
        add(trababox);
        
        alarma=new JLabel();
        alarma.setIcon(new ImageIcon(getClass().getResource("alarma.png")));
        alarma.setBounds(5,245,200,30);
        add(alarma);
        
        alarmabox=new JTextField(""+alarmaresult);
        alarmabox.setBounds(142,248,63,20);
        alarmabox.setEnabled(false);
        add(alarmabox);
        
        grua=new JLabel();
        grua.setIcon(new ImageIcon(getClass().getResource("grua.png")));
        grua.setBounds(5,275,200,30);
        add(grua);
        
        gruabox=new JTextField(""+gruaresult);
        gruabox.setBounds(126,278,79,20);
        gruabox.setEnabled(false);
        add(gruabox);
    }
    
    public void boton(){
        calcular = new JButton("Calcular");
        calcular.setBounds (156, 320, 90, 30);
        add(calcular);
        calcular.addActionListener(this);
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==calcular){
            try{
                costo=Integer.parseInt(autobox.getText());
                
                if(costo<2500){
                    JOptionPane.showMessageDialog(null,"Digite el valor valido de un vehículo");
                    pdbox.setText("0");
                    trababox.setText("0");
                    alarmabox.setText("0");
                    gruabox.setText("0");
                    autobox.requestFocus();
                }
                else{
                    pdresult=(costo*10)/1000;
                pdbox.setText(""+pdresult);
            
                trabaresult=(((costo*10)/100)/2)+2000;
                trababox.setText(""+trabaresult); 
                
                alarmaresult=(((costo*10)/100)/2)+5000;
                alarmabox.setText(""+alarmaresult);
                
                gruaresult=((costo*10)/100)/2;
                gruabox.setText(""+gruaresult);
                }                                   
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Digite el valor valido de un vehículo");
                costo=0;
                pdbox.setText("0");
                trababox.setText("0");
                alarmabox.setText("0");
                gruabox.setText("0");
                autobox.requestFocus();
            }
            
            
        }
    }
}