/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mackenzie.model;

/**
 *
 * @author Bruno
 */
public enum StatusProduto {
    DISPONIVEL(1),ALUGADO(2);
    
    private final int valor;

    private StatusProduto(int valor) {
        this.valor = valor;
    }
    public int getStatus(){
        return valor;
    }
    
}
