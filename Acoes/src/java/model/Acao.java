/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alexandre.Torres
 */
public class Acao {
    private String codigo;
    private double precoMin;
    private double precoMax;
    private double precoAbertura;
    private double precoFechamento;

    public Acao(String codigo, double precoMin, double precoMax, double precoAbertura, double precoFechamento) {
        this.codigo = codigo;
        this.precoMin = precoMin;
        this.precoMax = precoMax;
        this.precoAbertura = precoAbertura;
        this.precoFechamento = precoFechamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecoMin() {
        return precoMin;
    }

    public void setPrecoMin(double precoMin) {
        this.precoMin = precoMin;
    }

    public double getPrecoMax() {
        return precoMax;
    }

    public void setPrecoMax(double precoMax) {
        this.precoMax = precoMax;
    }

    public double getPrecoAbertura() {
        return precoAbertura;
    }

    public void setPrecoAbertura(double precoAbertura) {
        this.precoAbertura = precoAbertura;
    }

    public double getPrecoFechamento() {
        return precoFechamento;
    }

    public void setPrecoFechamento(double precoFechamento) {
        this.precoFechamento = precoFechamento;
    }
    
    
    
}
