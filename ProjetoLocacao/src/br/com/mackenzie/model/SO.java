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
public enum SO {
    ANDROID(1),MAC(2),NAOINFORMADO(3);
    
    private final int valor;
    
    SO(int valorStatus){
        valor = valorStatus;
    }
    
    public int getSO(){
        return valor;
    }
}
