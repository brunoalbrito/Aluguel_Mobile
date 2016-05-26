package br.com.mackenzie.model;

//
import java.util.Date;

public abstract class Produto {

    protected String modeloProduto;
    protected SO sistemaOperacional;
    protected Date anoFabricacao;
    protected double telaPol;
    protected String telaResolucao;
    protected String fabricante;
    protected double precoPorDia;
    protected boolean statusAlugado;
    protected String acessorios;

    public Produto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, double precoPorDia, boolean statusAlugado, String acessorios) {
        this.modeloProduto = modeloProduto;
        this.sistemaOperacional = sistemaOperacional;
        this.anoFabricacao = anoFabricacao;
        this.telaPol = telaPol;
        this.telaResolucao = telaResolucao;
        this.fabricante = fabricante;
        this.precoPorDia = precoPorDia;
        this.statusAlugado = statusAlugado;
        this.acessorios = acessorios;
    }

    public void alterarStatusProduto(boolean status) {
    }

    public void visualizarProdutos() {
    }

    public void acrescentarProduto() {
    }

    public void alterarDadosProduto() {
    }

    public void excluirProduto() {
    }

    public void selecionarProduto() {
    }
}
