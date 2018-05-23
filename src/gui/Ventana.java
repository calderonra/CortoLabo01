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
     public Ventana() {
        super("Calculadora D:");
        initComponent();
    }

    private void initComponent(){
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);   
    }

}
