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
        String texto = null;
        try {
            SimpleDateFormat ano = new SimpleDateFormat("yyyy");
            texto = "Modelo: " + modeloProduto + " / Sistema Operacional: " + sistemaOperacional + " / Ano de Fabricação: "
                    + ano.format(anoFabricacao) + " / Polegadas: " + telaPol + " \nFabricante: " + fabricante + " / Fornecedor: " + fornecedor.getNomeFornecedor() + " / Preço por dia: "
                    + precoPorDia + " / Status: " + statusAlugado + " \nAcessorio: " + acessorios + ""
                    + " / Resolução da Camera: " + cameraResolucao + " / Tipo de Conexão: " + tipoRede + "G" + " / DualChip: " + ((dualChip == true) ? "Sim" : "Não") + "\n\n";
        } catch (Exception e) {
            System.out.println(e);
        }
        return texto;
    }

    public void alterarDadosProduto(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, Fornecedor fornecedor, double precoPorDia, StatusProduto statusAlugado, String acessorios, double cameraResolucao, char tipoRede, boolean dualChip) {
        super.modeloProduto = modeloProduto;
        this.sistemaOperacional = sistemaOperacional;
        this.anoFabricacao = anoFabricacao;
        this.telaPol = telaPol;
        this.telaResolucao = telaResolucao;
        this.fabricante = fabricante;
        this.fabricante = fabricante;
        this.precoPorDia = precoPorDia;
        this.statusAlugado = statusAlugado;
        this.acessorios = acessorios;
        this.cameraResolucao = cameraResolucao;
        this.tipoRede = tipoRede;
        this.dualChip = dualChip;
    }

    public double getCameraResolucao() {
        return cameraResolucao;
    }

    public char getTipoRede() {
        return tipoRede;
    }

    public boolean isDualChip() {
        return dualChip;
    }

}
