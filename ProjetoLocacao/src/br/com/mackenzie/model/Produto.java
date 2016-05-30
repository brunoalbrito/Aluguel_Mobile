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
    protected Fornecedor fornecedor;
    protected double precoPorDia;
    protected StatusProduto statusAlugado;
    protected String acessorios;

    public Produto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, Fornecedor fornecedor, double precoPorDia,StatusProduto statusProduto, String acessorios) {
        this.modeloProduto = modeloProduto;
        this.sistemaOperacional = sistemaOperacional;
        this.anoFabricacao = anoFabricacao;
        this.telaPol = telaPol;
        this.telaResolucao = telaResolucao;
        this.fabricante = fabricante;
        this.fornecedor = fornecedor;
        this.precoPorDia = precoPorDia;
        this.statusAlugado = statusProduto;
        this.acessorios = acessorios;
    }

    public void alterarStatusProduto(StatusProduto statusProduto) {
        this.statusAlugado = statusProduto; 
    }

    public String visualizarProdutos() {
        return "Modelo: " + modeloProduto + " / Sistema Operacional " + sistemaOperacional + " / Ano de Fabricação: "
                + anoFabricacao + " / Polegadas: " + telaPol + " / Fabricante: " + fabricante + " / Preço por dia: "
                + precoPorDia + " / Status: " + statusAlugado + " / Acessorio: " + acessorios;
    }



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


    
    //Preco por Dia 
    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public String getModeloProduto() {
        return modeloProduto;
    }

    public SO getSistemaOperacional() {
        return sistemaOperacional;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getTelaPol() {
        return telaPol;
    }

    public String getTelaResolucao() {
        return telaResolucao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public StatusProduto getStatusAlugado() {
        return statusAlugado;
    }

    public String getAcessorios() {
        return acessorios;
    }
    
}
