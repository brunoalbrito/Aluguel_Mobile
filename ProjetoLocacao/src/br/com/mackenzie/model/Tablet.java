package br.com.mackenzie.model;

//
import java.util.Date;

public class Tablet extends Produto {

    private boolean camera;
    private boolean acessoRede;

    public Tablet(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, Fornecedor fornecedor, double precoPorDia, StatusProduto statusProduto, String acessorios, boolean camera, boolean acessoRede) {
        super(modeloProduto, sistemaOperacional, anoFabricacao, telaPol, telaResolucao, fabricante, fornecedor, precoPorDia, statusProduto, acessorios);
        this.camera = camera;
        this.acessoRede = acessoRede;
    }

    @Override
    public String visualizarProdutos() {
        return "Modelo: " + modeloProduto + " Sistema Operacional " + sistemaOperacional + " Ano de Fabricação: "
                + anoFabricacao + " Polegadas: " + telaPol + " Fabricante: " + fabricante + " Preço por dia: "
                + precoPorDia + " Status: " + statusAlugado + " Acessorio: " + acessorios + ""
                + "Possui Camera: " + camera + " Acesso à Rede: " + acessoRede;
    }

    public void alterarDadosProduto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, double precoPorDia, boolean statusAlugado, String acessorios, boolean camera, boolean acessoRede) {
        this.modeloProduto = modeloProduto;
        this.sistemaOperacional = SO.NAOINFORMADO;
        this.anoFabricacao = anoFabricacao;
        this.telaPol = telaPol;
        this.telaResolucao = telaResolucao;
        this.fabricante = fabricante;
        this.precoPorDia = precoPorDia;
        this.statusAlugado = StatusProduto.DISPONIVEL;
        this.acessorios = acessorios;
        this.camera = camera;
        this.acessoRede = acessoRede;
    }
}
