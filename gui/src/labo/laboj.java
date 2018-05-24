/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author UCA
 */
public class laboj extends JFrame{
    private JTextField caja1;
    private JTextField caja2;
    private JButton boton;
    public laboj(){
    initialComponents();
    }
    
    public void initialComponents(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    caja1 = new JTextField();//Se puede mandar como parametro algun valor predederminado o defecto que se muestre en la caja de texto
    caja1.setBounds(10,50,150,30);
    
    boton = new JButton("Click aca");
    boton.setBounds(10,100,150,30);
    
    caja2= new JTextField();
    caja2.setBounds(10,150,150,30);
    caja2.setEditable(false);//Evita que el usuario edite la caja de texto
    
    Container contenedor = getContentPane();
    contenedor.add(caja1);
    contenedor.add(caja2);
    contenedor.add(boton);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            caja2.setText(caja1.getText());
        }
    });
    
    setSize(300,300);
    }
    
    public static void main(String[]args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new laboj().setVisible(true);
            }
        });
    }
}
