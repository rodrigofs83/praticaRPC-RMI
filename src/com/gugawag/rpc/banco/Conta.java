package com.gugawag.rpc.banco;

import java.io.Serializable;

public class Conta implements Serializable {
    private  String numero;
    private double saldo;
    public String getNumero() {
        return numero;
    }
    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
    }
    public Conta(String conta) {
        this.numero = conta;
        this.saldo = 0;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
