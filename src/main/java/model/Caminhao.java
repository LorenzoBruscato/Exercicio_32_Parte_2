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
public class Caminhao extends Veiculo{
    private int cargamax;
    private int alturamax;
    private int comprimento;

    public Caminhao() {
    }

    public Caminhao(int cargamax, int alturamax, int comprimento) {
        this.cargamax = cargamax;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    public Caminhao(int cargamax, int alturamax, int comprimento, int quilos, int velocmax, int Preco) {
        super(quilos, velocmax, Preco);
        this.cargamax = cargamax;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

   

    public int getCargamax() {
        return cargamax;
    }

    public void setCargamax(int cargamax) {
        this.cargamax = cargamax;
    }

    public int getAlturamax() {
        return alturamax;
    }

    public void setAlturamax(int alturamax) {
        this.alturamax = alturamax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    
    @Override
  public void leitura() {
        super.leitura();
        setCargamax(Integer.parseInt(JOptionPane.showInputDialog("Carga Max:")));
        setAlturamax(Integer.parseInt(JOptionPane.showInputDialog("Altura: ")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Comprimento: ")));
  }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    @Override
    public String paraString() {
        return (super.paraString()
                + "\nCarga Maxima: " + getCargamax()
                + "ton\nAltura Maxima: " + getAlturamax()
                + "m\nComprimento: " + getComprimento() + "m");
    }
}