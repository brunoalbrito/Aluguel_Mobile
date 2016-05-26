package br.com.mackenzie.model;

import java.util.Date;

public class Smartphone extends Produto {

    private double cameraResolucao;
    private char tipoRede;
    private boolean dualChip;

    public Smartphone(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, double precoPorDia, boolean statusAlugado, String acessorios,double cameraResolucao,char tipoRede,boolean dualChip) {
        super(modeloProduto, sistemaOperacional, anoFabricacao, telaPol, telaResolucao, fabricante, precoPorDia, statusAlugado, acessorios);
        this.cameraResolucao = cameraResolucao;
        this.tipoRede = tipoRede;
        this.dualChip = dualChip;
    }
}
