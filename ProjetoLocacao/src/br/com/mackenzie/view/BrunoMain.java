/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mackenzie.view;

import br.com.mackenzie.model.Produto;
import br.com.mackenzie.model.SO;
import br.com.mackenzie.model.Smartphone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class BrunoMain {
    public static void main(String[] args) throws ParseException {
        ArrayList<Produto> produtos = new ArrayList<>();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        String data = "2015";
        
        produtos.add(new Smartphone("Nokia", SO.ANDROID,formatador.parse(data) , 0, "Teste", "Kibom", 0, true, "Sorvete", 0, 'A', true));
        System.out.println(produtos.get(produtos.size() -1).visualizarProdutos());;
    }
}
