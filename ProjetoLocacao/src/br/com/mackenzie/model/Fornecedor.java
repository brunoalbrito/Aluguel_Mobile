package br.com.mackenzie.model;

public class Fornecedor {

    private String nomeFornecedor;
    private int tel;
    private long cod;

    public Fornecedor(String nomeFornecedor, int tel, long cnpj) {
        this.nomeFornecedor = nomeFornecedor;
        this.tel = tel;
        this.cod = cnpj;
    }
    
    public long getCod() {
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
