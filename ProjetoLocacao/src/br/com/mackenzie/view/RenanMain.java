package br.com.mackenzie.view;

import br.com.mackenzie.model.Cliente;
import br.com.mackenzie.model.Controle;

/**
 *
 * @author RSGermano
 */
public class RenanMain {
    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.cadastrarCliente();
        
        controle.cadastrarCliente();
        controle.cadastrarCliente();
        controle.cadastrarCliente();
        controle.cadastrarCliente();
        controle.cadastrarCliente();
        controle.cadastrarCliente();
        
        controle.dumpClientes();
        
        controle = new Controle();
        for(Cliente cliente:controle.getClientes()){
            cliente.toString();
        }
    }
}
