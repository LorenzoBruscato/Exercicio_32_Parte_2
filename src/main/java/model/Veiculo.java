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
public class Veiculo {

    private int quilos;
    private int velocmax;
    private float Preco;

    public Veiculo() {
    }

    public Veiculo(int quilos, int velocmax, int Preco) {
        this.quilos = quilos;
        this.velocmax = velocmax;
        this.Preco = Preco;
    }

    public int getQuilos() {
        return quilos;
    }

    public void setQuilos(int quilos) {
        this.quilos = quilos;
    }

    public int getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

   

    public void leitura() {
        setPreco(Integer.parseInt(JOptionPane.showInputDialog("Preco: ")));
        setQuilos(Integer.parseInt(JOptionPane.showInputDialog("Quilos: ")));
        setVelocmax(Integer.parseInt(JOptionPane.showInputDialog("VelocMax: ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return ("Quilos: " + getQuilos() + "\nVelocidade_Max: " + getVelocmax()+ "\nPreco: " + getPreco());
    }

}