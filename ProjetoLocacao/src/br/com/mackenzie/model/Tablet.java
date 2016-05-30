package br.com.mackenzie.model;

//
import java.text.SimpleDateFormat;
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

    public boolean isCamera() {
        return camera;
    }

    public boolean isAcessoRede() {
        return acessoRede;
    }

    
    
    @Override
    public String visualizarProdutos() {
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        return "Modelo: " + modeloProduto + " / Sistema Operacional " + sistemaOperacional + " / Ano de Fabricação: "
                + ano.format(anoFabricacao) + " / Polegadas: " + telaPol + " / Fabricante: " + fabricante + " / Fornecedor: "+ fornecedor.getNomeFornecedor() + " / Preço por dia: "
                + precoPorDia + " / Status: " + statusAlugado + " / Acessorio: " + acessorios + " / Possui Camera: " + camera + " / Acesso à Rede: " + acessoRede;
    }

    public void alterarDadosProduto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante,Fornecedor fornecedor, double precoPorDia,StatusProduto statusProduto, String acessorios, boolean camera, boolean acessoRede) {
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
        this.camera = camera;
        this.acessoRede = acessoRede;
    }    
}
