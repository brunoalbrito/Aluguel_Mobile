package br.com.mackenzie.model;

public class Fornecedor {

    private String nomeFornecedor;
    private int tel;
    private static int last = 0;
    private int cod;

    public Fornecedor(String nomeFornecedor, int tel) {
        this.nomeFornecedor = nomeFornecedor;
        this.tel = tel;
        this.cod = last++;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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
