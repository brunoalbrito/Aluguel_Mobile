package br.com.mackenzie.model;

public class Fisico extends Cliente {
	private long CPF;
	private String nomeCompleto;

    public Fisico(String nome, long CPF, String endereco, int telefone) {
        super(endereco, telefone);
        this.nomeCompleto = nome;
        this.CPF = CPF;
    }

    public long getCPF() {
        return CPF;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    //Bruno que fez - se der erro é culpa minha
    public void alterarDados(String nomeCompleto, long CPF,String endereco,int telefone){
        this.nomeCompleto =  nomeCompleto;
        this.CPF = CPF;
        super.endereco = endereco;
        super.telefone = telefone;
    }

    @Override
    public String toString() {
        return "CPF= " + CPF + ", Nome Completo= " + nomeCompleto;
    }
    
    
}
