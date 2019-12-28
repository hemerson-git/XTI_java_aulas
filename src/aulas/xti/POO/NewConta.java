package aulas.xti.POO;

import java.io.Serializable;

public class NewConta implements Serializable{
    private String nome;
    private double saldo;
    //private String conta;
    
    public NewConta(){}
    public NewConta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public String getName(){
        return nome;
    }
    
    public void setName(String nome){
        this.nome = nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void exibeSaldo(){
        System.out.println(nome + " Seu saldo é: " + saldo);
    }
}
