package br.com.mackenzie.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Smartphone extends Produto {

    private double cameraResolucao;
    private char tipoRede;
    private boolean dualChip;

    public Smartphone(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, Fornecedor fornecedor, double precoPorDia, StatusProduto statusProduto, String acessorios, double cameraResolucao, char tipoRede, boolean dualChip) {
        super(modeloProduto, sistemaOperacional, anoFabricacao, telaPol, telaResolucao, fabricante, fornecedor, precoPorDia, statusProduto, acessorios);
        this.cameraResolucao = cameraResolucao;
        this.tipoRede = tipoRede;
        this.dualChip = dualChip;
    }

    @Override
    public String visualizarProdutos() {
        return "Modelo: " + modeloProduto + " Sistema Operacional " + sistemaOperacional + " Ano de Fabricação: "
                + anoFabricacao + " Polegadas: " + telaPol + " Fabricante: " + fabricante + " Preço por dia: "
                + precoPorDia + " Status: " + statusAlugado + " Acessorio: " + acessorios + ""
                + "Resolução da Camera: " + cameraResolucao + " Tipo de Conexão+ " + tipoRede + " DualChip: " + dualChip;
    }

    public void alterarDadosProduto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, double precoPorDia, StatusProduto statusAlugado, String acessorios, double cameraResolucao, char tipoRede, boolean dualChip) {
        super.modeloProduto = modeloProduto;
        this.sistemaOperacional = SO.NAOINFORMADO;
        this.anoFabricacao = anoFabricacao;
        this.telaPol = telaPol;
        this.telaResolucao = telaResolucao;
        this.fabricante = fabricante;
        this.precoPorDia = precoPorDia;
        this.statusAlugado = statusAlugado;
        this.acessorios = acessorios;
        this.cameraResolucao = cameraResolucao;
        this.tipoRede = tipoRede;
        this.dualChip = dualChip;
    }

    @Override
    public String toString() {
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        return "Modelo: " + modeloProduto + " Sistema Operacional: " + sistemaOperacional + " Ano Fabricação: " + ano.format(anoFabricacao)
                + "\nPolegadas: " + telaPol + " Resoluçâo: " + telaResolucao + " Fabricante: " + fabricante + " \nPreço p/ dia: " + precoPorDia
                + " Status: " + statusAlugado + " \nAcessorios: " + acessorios + " Resolução da Câmera: " + cameraResolucao + " Tipo de Rede+ "
                + tipoRede + " Dual Chip: " + dualChip;
    }
}
