/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class CarroPasseio extends Veiculo{
    private String cor;
    private String modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public CarroPasseio(String cor, String modelo, int quilos, int velocmax, int Preco) {
        super(quilos, velocmax, Preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setCor(JOptionPane.showInputDialog("Qual é a cor: "));
        setModelo(JOptionPane.showInputDialog("Qual é o modelo: "));
    }
    @Override
     public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }
    @Override
     public String paraString() {
         return(super.paraString()+ "\nCor: " + getCor() + "\nModelo: " + getModelo()); 
     }
}