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
    protected StatusProduto statusAlugado;
    protected String acessorios;

    public Produto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, double precoPorDia, boolean statusAlugado, String acessorios) {
        this.modeloProduto = modeloProduto;
        this.sistemaOperacional = SO.NAOINFORMADO;
        this.anoFabricacao = anoFabricacao;
        this.telaPol = telaPol;
        this.telaResolucao = telaResolucao;
        this.fabricante = fabricante;
        this.precoPorDia = precoPorDia;
        this.statusAlugado = StatusProduto.DISPONIVEL;
        this.acessorios = acessorios;
    }

    public void alterarStatusProduto(boolean status) {
    }

    public String visualizarProdutos() {
        return "Modelo: " + modeloProduto + " Sistema Operacional " + sistemaOperacional + " Ano de Fabricação: "
                + anoFabricacao + " Polegadas: " + telaPol + " Fabricante: " + fabricante + " Preço por dia: "
                + precoPorDia + " Status: " + statusAlugado + " Acessorio: " + acessorios;
    }

//    public void acrescentarProduto() {
//    }
    public void alterarDadosProduto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, double precoPorDia, boolean statusAlugado, String acessorios) {
        this.modeloProduto = modeloProduto;
        this.sistemaOperacional = SO.NAOINFORMADO;
        this.anoFabricacao = anoFabricacao;
        this.telaPol = telaPol;
        this.telaResolucao = telaResolucao;
        this.fabricante = fabricante;
        this.precoPorDia = precoPorDia;
        this.statusAlugado = StatusProduto.DISPONIVEL;
        this.acessorios = acessorios;
    }

//    public void excluirProduto() {
//    }
//    public void selecionarProduto() {
//    }
    
    //Preco por Dia 
    public double getPrecoPorDia() {
        return precoPorDia;
    }
    
}
