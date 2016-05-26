package br.com.mackenzie.model;

//

import java.util.Date;


public class Tablet extends Produto {
	private boolean camera;
	private boolean acessoRede;
        
        public Tablet(String modeloProduto, SO sistemaOperacional, Date anoFabricacao, double telaPol, String telaResolucao,
            String fabricante, double precoPorDia, boolean statusAlugado, String acessorios,boolean camera,boolean acessoRede) {
        super(modeloProduto, sistemaOperacional, anoFabricacao, telaPol, telaResolucao, fabricante, precoPorDia, statusAlugado, acessorios);
        this.camera = camera;
        this.acessoRede = acessoRede;
    }
}
