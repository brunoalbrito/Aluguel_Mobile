package br.com.mackenzie.model;
//
//

import java.util.ArrayList;
import java.util.List;

//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Locacao
//  @ File Name : Controle.java
//  @ Date : 23/05/2016
//  @ Author : 
//
//
public class Controle {
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private List<Fornecedor> fornecedores;
    private List<Locacao> locacoes;
    
    public Controle(){
        //Inicializando lista com elementos do sistema
        clientes = new ArrayList();
        produtos = new ArrayList();
        fornecedores = new ArrayList();
        locacoes = new ArrayList();
        
        //Lendo arquivos Txt que possuem elementos do sistema já salvos
        
        
    }

    //Métodos para a classe Cliente
    
    //Método que verifica, a partir do CPF ou CNPJ, se o cliente já está cadastrado no Sistema
    public boolean consultaCliente(int codigo) {
        //Percorrendo lista de clientes para encontrar cliente desejado
        for (Cliente cliente : clientes) {
            if(cliente instanceof Fisico){
                Fisico fisico = (Fisico)cliente;
                if(fisico.getCPF() == codigo){
                    return true;
                }
            }else{
                Juridico juridico = (Juridico) cliente;
                if(juridico.getCNPJ() == codigo){
                    return true;
                }
            }
        }
        return false;
    }

    //Método para validar informações digitadas pelo funcionário da loja, validá-las e criar um novo Cliente
    public void cadastrarCliente(String endereco, String telefone, int codigo, String nome) {
        //Faser validação dos parâmetros
        
        //Instânciar, de acordo com alguma lógica para descobrir o tipo, um novo Cliente Físico ou Jurídico
        
    }
    
    //Método para alterar os dados de um Cliente já existente no sistema
    public void alterarDadosCliente(String endereco, String telefone, int codigo, String nome){
        
    }

    //Métodos para a Classe Produto
    public void acrescentarProduto(){
        
    }
    
    public void visualizarProdutos(){
        
    }
    
    public void alterarDadosProduto(){
        
    }
    
    public void excluirProduto(){
        
    }
    
    public void selecionarProduto(){
        
    }
    
    //Métodos para a Classe Fornecedor
    public void acrescentarFornecedor(){}
    
    public void consultarFonecedor(){}
    
    public void alterarDadosFornecedor(){}
    
    public void excluirFornecedor(){}
    
    public void selecionarFornecedor(){}    
    
    //Métodos para a Classe Locação
}
