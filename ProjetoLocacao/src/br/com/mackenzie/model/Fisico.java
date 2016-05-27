package br.com.mackenzie.model;

public class Fisico extends Cliente {
	private int CPF;
	private String nomeCompleto;

    public Fisico(String nome, int CPF, String endereco, int telefone) {
        super(endereco, telefone);
        this.nomeCompleto = nome;
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
