/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import aritmetico.aritmetico;
import conversor.conversor;
import fabricas.FabricaDeFabricas;
import fabricas.fabricaAbs;
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
    private JButton boton,boton2,boton3,boton4,boton5;
    private JTextField caja1,caja2,caja3;
    fabricaAbs fabrica;
     public Ventana() {
        super("Calculadora D:");
        initComponent();
    }

    private void initComponent(){
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);   
         setSize(600, 600); //tamaño de la ventana 
      Container contenedor = getContentPane();
         boton = new JButton("Suma");
        boton.setBounds(10,200, 150, 30);
        boton2 = new JButton("resta");
        boton2.setBounds(10,250, 150, 30);
        boton3= new JButton("multiplicacion");
        boton3.setBounds(10,300, 150, 30);
        boton4 = new JButton("division");
        boton4.setBounds(10,150, 150, 30);
        boton5 = new JButton("binario");
        boton5.setBounds(10,50, 150, 30);
        
        contenedor.add(boton);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);
        caja1 = new JTextField();
        caja1.setBounds(300, 200, 150, 30);
        contenedor.add(caja1);
        caja2 = new JTextField();
        caja2.setBounds(300, 250, 150, 30);
        contenedor.add(caja2);
        caja3 = new JTextField();
        caja3.setBounds(300, 350, 150, 30);
        contenedor.add(caja3);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float calculo=0,num1=0,num2=0;
                String aux1,aux2,saltin;
                fabrica = FabricaDeFabricas.getfabrica("aritmetica");
                aritmetico sumar=fabrica.getaritmetico("Suma");
                aux1=caja1.getText();
                aux2=caja2.getText();   
                num1=Float.parseFloat(aux1);
                num2=Float.parseFloat(aux2);
                calculo=sumar.calcular(num1, num2);
                saltin=String.valueOf(calculo);
                caja3.setText(saltin);  
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float calculo=0,num1=0,num2=0;
                String aux1,aux2,saltin;
                fabrica = FabricaDeFabricas.getfabrica("aritmetica");
                aritmetico sumar=fabrica.getaritmetico("Resta");
                aux1=caja1.getText();
                aux2=caja2.getText();   
                num1=Float.parseFloat(aux1);
                num2=Float.parseFloat(aux2);
                calculo=sumar.calcular(num1, num2);
                saltin=String.valueOf(calculo);
                caja3.setText(saltin);  
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float calculo=0,num1=0,num2=0;
                String aux1,aux2,saltin;
                fabrica = FabricaDeFabricas.getfabrica("aritmetica");
                aritmetico sumar=fabrica.getaritmetico("Multiplicacion");
                aux1=caja1.getText();
                aux2=caja2.getText();   
                num1=Float.parseFloat(aux1);
                num2=Float.parseFloat(aux2);
                calculo=sumar.calcular(num1, num2);
                saltin=String.valueOf(calculo);
                caja3.setText(saltin);  
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float calculo=0,num1=0,num2=0;
                String aux1,aux2,saltin;                
                fabrica = FabricaDeFabricas.getfabrica("aritmetica");
                aritmetico sumar=fabrica.getaritmetico("Division");
                aux1=caja1.getText();
                aux2=caja2.getText();   
                num1=Float.parseFloat(aux1);
                num2=Float.parseFloat(aux2);
                calculo=sumar.calcular(num1, num2);
                saltin=String.valueOf(calculo);
                caja3.setText(saltin);  
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int calculo=0,num1=0,num2=0;
                String aux1,aux2,saltin;
                fabrica = FabricaDeFabricas.getfabrica("conversor");
                conversor bin=fabrica.getconversor("conversor");
                aux1=caja1.getText();
                num1=Integer.parseInt(aux1);
                calculo=bin.convertir(num1);
                saltin=String.valueOf(calculo);
                caja3.setText(saltin);  
            }
        });
        
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
