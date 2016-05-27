package br.com.mackenzie.model;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Locacao
//  @ File Name : Juridico.java
//  @ Date : 23/05/2016
//  @ Author : 
//
//


public class Juridico extends Cliente {
	private int CNPJ;
	private String nomeFantasia;

    public Juridico(String nomeFantasia, int CNPJ, String endereco, int telefone) {
        super(endereco, telefone);
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }        
}
