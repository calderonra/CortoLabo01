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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Raul Calderon
 */
public class Ventana extends JFrame {
    private JButton boton,boton2,boton3,boton4;
     public Ventana() {
        super("Calculadora D:");
        initComponent();
    }

    private void initComponent(){
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);   
         setSize(600, 300); //tamaño de la ventana 
      Container contenedor = getContentPane();
         boton = new JButton("Suma");
        boton.setBounds(10,200, 150, 30);
        boton2 = new JButton("resta");
        boton2.setBounds(10,250, 150, 30);
        boton3= new JButton("multiplicacion");
        boton3.setBounds(10,300, 150, 30);
        boton4 = new JButton("division");
        boton4.setBounds(10,150, 150, 30);
        contenedor.add(boton);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        
    }
public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
