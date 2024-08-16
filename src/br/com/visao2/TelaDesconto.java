/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao2;

import br.com.controle2.Desconto;
import javax.swing.JOptionPane;

public class TelaDesconto {
    public static void main(String[] args) {
        
        Desconto v = new Desconto();
        
        v.setValor(Double.valueOf(JOptionPane.showInputDialog("Digite o valor da compra")));
        
        JOptionPane.showMessageDialog(null, "Valor final: R$" + v.calcularDesconto());
    }
}
