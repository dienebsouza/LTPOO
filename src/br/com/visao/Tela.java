/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Dobro;
import javax.swing.JOptionPane;

public class Tela {
    public static void main(String[] args) {
        //cópia de Dobro -> d
        Dobro d = new Dobro();
        d.setValor(Integer.valueOf(JOptionPane.showInputDialog("Digite um número")));
        
        JOptionPane.showMessageDialog(null, d.calcularDobro());
    }
}
