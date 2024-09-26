package com.myproject;

import javax.swing.JOptionPane;

public class Entrada_Ejemplo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        
        JOptionPane.showMessageDialog(null, "Hola " + Nombre_usuario);
    }
}

