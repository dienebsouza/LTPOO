/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle2;

public class Desconto {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //prof
    public double calcularDesconto(){
        double total=0;
        if(this.valor <= 300){
            total = this.valor-(this.valor*0.05);
        }
        else{
            total = this.valor-(this.valor*0.1);
        }
        return total;
    }
    
    //meu
    /**public double calcularDesconto(){
        if (valor < 300){
            return this.valor-(this.valor*(5/100));
        }
        else {
           return this.valor-(this.valor*(10/100));
        }
    
    }
    */
}
