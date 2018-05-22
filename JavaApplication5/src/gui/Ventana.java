/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UCA
 */

public class Ventana extends JFrame{
    
    private JTextField caja1, caja2, caja3, caja4, caja5;
    private JButton boton, boton1, boton2, boton3, boton4;
    private JLabel label1, label2;
    
    
    
    public Ventana(){
        super("Titulo de la ventana");
        initComponent();
    }
    
    public void initComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        Container contenedor = getContentPane();
        
        label1 = new JLabel("Calculadora");
        label1.setBounds(140,4,500,20);
        contenedor.add(label1);
        
        caja1 = new JTextField("a");
        caja1.setBounds(10,30,150,30);
        contenedor.add(caja1);
        
        caja2 = new JTextField("b");
        caja2.setBounds(210,30,150,30);
        contenedor.add(caja2);

        boton = new JButton("+");
        boton.setBounds(10,80,50,30);
        contenedor.add(boton);
        
        boton1 = new JButton("-");
        boton1.setBounds(60,80,50,30);
        contenedor.add(boton1);
        
        boton2 = new JButton("*");
        boton2.setBounds(110,80,50,30);
        contenedor.add(boton2);
        
        boton3 = new JButton("/");
        boton3.setBounds(160,80,50,30);
        contenedor.add(boton3);
        
        label2 = new JLabel("Conversor");
        label2.setBounds(140,130,500,20);
        contenedor.add(label2);
        
        caja3 = new JTextField("c");
        caja3.setBounds(10,170,150,30);
        contenedor.add(caja3);
        
        boton4 = new JButton("a binario");
        boton4.setBounds(210,170,150,30);
        contenedor.add(boton4);
        
        caja4 = new JTextField("resultadoAB");
        caja4.setBounds(400,30,150,30);
        contenedor.add(caja4);
        
        caja5 = new JTextField("resultadoC");
        caja5.setBounds(400,170,150,30);
        contenedor.add(caja5);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //JOptionPane.showMessageDialog(null, "Diste click");
                caja2.setText(caja1.getText());
            }
        });
        
        setSize(600,270);
    }
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                new Ventana().setVisible(true);
            }
        });
    }
}

