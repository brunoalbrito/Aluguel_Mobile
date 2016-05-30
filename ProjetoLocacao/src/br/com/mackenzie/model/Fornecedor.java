package br.com.mackenzie.model;

public class Fornecedor {

    private String nomeFornecedor;
    private int tel;
    private int cod;

    public Fornecedor(String nomeFornecedor, int tel, int cnpj) {
        this.nomeFornecedor = nomeFornecedor;
        this.tel = tel;
        this.cod = cnpj;
    }
    
    public int getCod() {
        return cod;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
