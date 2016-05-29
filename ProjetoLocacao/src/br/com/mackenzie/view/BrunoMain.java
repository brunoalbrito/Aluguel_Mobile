/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mackenzie.view;

import br.com.mackenzie.model.Fornecedor;
import br.com.mackenzie.model.Produto;
import br.com.mackenzie.model.SO;
import br.com.mackenzie.model.Smartphone;
import br.com.mackenzie.model.StatusProduto;
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

        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        String data = "2015";

        Fornecedor f = new Fornecedor("Nokie", 0);

        Smartphone p = new Smartphone("Moto G", SO.ANDROID, formatador.parse("2015"), 0, data, data, f, 0, StatusProduto.DISPONIVEL, data, 0, 'A', true);
        System.out.println(p.toString());
    }
}
