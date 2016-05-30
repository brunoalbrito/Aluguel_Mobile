package br.com.mackenzie.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private Scanner entrada = new Scanner(System.in);

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public Controle() {
        //Inicializando lista com elementos do sistema
        clientes = new ArrayList();
        produtos = new ArrayList();
        fornecedores = new ArrayList();
        locacoes = new ArrayList();

        //Lendo arquivos Txt que possuem elementos do sistema já salvos
        inicializarClientes("clientes.txt");
        inicializarProdutos("produtos.txt");
        inicializarFornecedores("fornecedores.txt");
        inicializarLocacoes("locacoes.txt");
    }

    //Métodos para a classe Cliente
    public Cliente consultaCliente(int codigo) {
        //verifica, a partir do CPF ou CNPJ, se o cliente já está cadastrado no Sistema
        //Percorrendo lista de clientes para encontrar cliente desejado
        for (Cliente cliente : clientes) {
            if (cliente instanceof Fisico) {
                Fisico fisico = (Fisico) cliente;
                if (fisico.getCPF() == codigo) {
                    return fisico;
                }
            } else {
                Juridico juridico = (Juridico) cliente;
                if (juridico.getCNPJ() == codigo) {
                    return juridico;
                }
            }
        }
        return null;
    }

    public void cadastrarCliente() {

        //Método para validar informações digitadas pelo funcionário da loja, validá-las e criar um novo Cliente
        System.out.println("Novo cliente 1 -Físico ou 2 - Jurídico?");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("CPF: ");
            int CPF = entrada.nextInt();
            System.out.println("Telefone: ");
            int tel = entrada.nextInt();
            System.out.println("Endereço: ");
            String endereco = entrada.next();
            Fisico f = new Fisico(nome, CPF, endereco, tel);

            clientes.add(f);

        }
        if (opcao == 2) {

            System.out.println("Nome Fantasia: ");
            String nome = entrada.next();
            System.out.println("CNPJ: ");
            int CNPJ = entrada.nextInt();
            System.out.println("Telefone: ");
            int tel = entrada.nextInt();
            System.out.println("Endereço: ");
            String endereco = entrada.next();
            Juridico j = new Juridico(nome, CNPJ, endereco, tel);

            clientes.add(j);
        }

    }

    public void alterarDadosCliente() {

        //altera os dados dos clientes    
        System.out.println("Digite o CPF ou CNPJ");

        int codigo = entrada.nextInt();

        Cliente c = consultaCliente(codigo);

        if (c != null) {

            if (c instanceof Fisico) {
                Fisico f = ((Fisico) c);
                System.out.println(f.toString());
                System.out.println("Informe o novo nome");
                String nomeCompleto = entrada.next();
                System.out.println("Informe o novo CPF");
                int CPF = entrada.nextInt();
                System.out.println("Informe o novo Endereço");
                String endereco = entrada.next();
                System.out.println("Informe o novo Telefone");
                int telefone = entrada.nextInt();

                f.alterarDados(nomeCompleto, CPF, endereco, telefone);
            }
            if (c instanceof Juridico) {
                Juridico j = ((Juridico) c);
                System.out.println(j.toString());
                System.out.println("Informe o novo Nome Fantasia");
                String nomeFantasia = entrada.next();
                System.out.println("Informe o novo CPF");
                int CNPJ = entrada.nextInt();
                System.out.println("Informe o novo CNPJ");
                String endereco = entrada.next();
                System.out.println("Informe o novo Telefone");
                int telefone = entrada.nextInt();
                j.alterarDados(nomeFantasia, CNPJ, endereco, telefone);
            }

        } else {
            System.out.println("Cliente nao encontrado");
        }

    }

    //Métodos para a Classe Produto
    public void acrescentarProduto() throws ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        System.out.println("Criando um produto:"
                + "\n Primeiramente selecione se seu produto é 1 - Smartphone ou 2 - Tablet");
        int opc = entrada.nextInt();

        System.out.println("Modelo do produto: ");
        String modeloProduto = entrada.next();
        System.out.println("Ano de fabricação (yyyy)");
        String data = entrada.next();
        System.out.println("Polegadas na tela: ");
        double pol = entrada.nextDouble();
        System.out.println("Resolução da tela (ppi):");
        String telaResolucao = entrada.next();
        System.out.println("Fabricante: ");
        String fabricante = entrada.next();
        System.out.println("Fornecedor cadastrado no sistema: ");
        int codigoF = entrada.nextInt();
        Fornecedor f = selecionarFornecedor(codigoF);
        System.out.println("Preço por dia: ");
        double preco = entrada.nextDouble();
        System.out.println("Acessorios: ");
        String acess = entrada.next();

        if (opc == 1) {

            System.out.println("Resolução da camera: ");
            double resolu = entrada.nextDouble();
            System.out.println("Rede: 3 - 3G / 4 - 4G");
            char rede = entrada.next().charAt(0);
            System.out.println("Dual chip 1 - Sim / 2 - Não");
            boolean dual = (entrada.nextInt() == 1);
            System.out.println("Sistema Operacional "
                    + "\n 1 - ANDROID"
                    + "\n 2 - APPLE"
                    + "\n 3 - WINDOWS PHONE "
                    + "\n 4 - NAO INFORMADO");
            int choose = entrada.nextInt();

            SO sistemaO = null;
            switch (choose) {
                case 1:
                    sistemaO = SO.ANDROID;
                    break;
                case 2:
                    sistemaO = SO.APPLE;
                    break;
                case 3:
                    sistemaO = SO.WINDOWS_PHONE;
                    break;
                case 4:
                    sistemaO = SO.NAOINFORMADO;
                    break;
            }

            Smartphone s = new Smartphone(modeloProduto, sistemaO, formatador.parse(data), pol, telaResolucao, fabricante, f, preco, StatusProduto.DISPONIVEL, acess, resolu, rede, dual);

            produtos.add(s);
        }
        if (opc == 2) {

            System.out.println("Tem camera? 1 - Sim / 2 - Não");
            boolean camera = (entrada.nextInt() == 1);
            System.out.println("Acessa a rede? 1 - Sim / 2 - Não");
            boolean conexao = (entrada.nextInt() == 1);
            System.out.println("Sistema Operacional "
                    + "\n1 - ANDROID"
                    + "\n2 - APPLE"
                    + "\n3 - WINDOWS PHONE "
                    + "\n4 - NAO INFORMADO");
            int choose = entrada.nextInt();

            SO sistemaO = null;
            switch (choose) {
                case 1:
                    sistemaO = SO.ANDROID;
                    break;
                case 2:
                    sistemaO = SO.APPLE;
                    break;
                case 3:
                    sistemaO = SO.WINDOWS_PHONE;
                    break;
                case 4:
                    sistemaO = SO.NAOINFORMADO;
                    break;
            }

            Tablet t = new Tablet(modeloProduto, sistemaO, formatador.parse(data), pol, telaResolucao, fabricante, f, preco, StatusProduto.DISPONIVEL, acess, camera, conexao);

            produtos.add(t);
        }

    }

    public void visualizarProdutos() {
        //Mostra todos os produtos disponíveis
        System.out.println("Todos os produtos disponiveis");
        for (Produto p : produtos) {
            if (p.getStatusAlugado() == StatusProduto.DISPONIVEL) {
                p.visualizarProdutos();
            }
        }
    }

    public void alterarDadosProduto() {//////////////////////////////////////////////////////////////implementar porfavor
        System.out.println("Qual o modelo que você deseja alterar os dados?");
        Produto p = selecionarProduto(entrada.next());
        if (p != null) {

            System.out.println(p.visualizarProdutos());

            if (p instanceof Smartphone) {

            }
            if (p instanceof Tablet) {

            }

        } else {
            System.out.println("Não encontrado!");
        }

    }

    public void excluirProduto() {
        //exclui da lista um determinado produto
        System.out.println("Qual produto voce deseja excluir?");
        Produto p = selecionarProduto(entrada.next());
        if (p != null) {

            System.out.println(p.visualizarProdutos());
            System.out.println("Deseja excluir esse? 1- sim / 2 - não");
            if (entrada.nextInt() == 1) {

                produtos.remove(p);

            }

        } else {
            System.out.println("não encontrado");
        }

    }

    public Produto selecionarProduto(String modelo) {
        //busca por modelo e devolve um produto
        for (Produto p : produtos) {
            if (p.getModeloProduto().contains(modelo)) {
                return p;
            }
        }
        return null;

    }

    //Métodos para a Classe Fornecedor
    public void acrescentarFornecedor() {
        //pede os dados de entrada e cria um fornecedor
        System.out.println("Nome do Fornecedor: ");
        String nome = entrada.next();
        System.out.println("Telefone para contato: ");
        int tel = entrada.nextInt();

        Fornecedor f = new Fornecedor(nome, tel);
        fornecedores.add(f);

    }

    public void consultarFonecedor() {

        //consulta por uma String e devolve todas as matches
        System.out.println("Qual o nome do fornecedor?");
        String nome = entrada.next();

        System.out.println("Resultados para a sua busca:");
        for (Fornecedor f : fornecedores) {
            if (f.getNomeFornecedor().contains(nome)) {
                System.out.println("Código: " + f.getCod() + " / Nome: " + f.getNomeFornecedor() + " / tel: " + f.getTel());
            }
        }

    }

    public void alterarDadosFornecedor() {

        //atualiza os dados de um fornecedor selecionado
        System.out.println("Qual o fornecedor?");
        int selec = entrada.nextInt();

        if (selecionarFornecedor(selec) != null) {
            Fornecedor f = selecionarFornecedor(selec);

            System.out.println("Altere o nome ou reescreva-o:");
            String novoNome = entrada.next();
            System.out.println("Altere o telefone ou reescreva-o:");
            int novoTel = entrada.nextInt();

            f.setNomeFornecedor(novoNome);
            f.setTel(novoTel);
        } else {
            System.out.println("Fornecedor não encontrado");
        }

    }

    public void excluirFornecedor() {

        //exclui diretamente um fornecedor do array
        System.out.println("Qual o fornecedor?");
        int selec = entrada.nextInt();

        if (selecionarFornecedor(selec) != null) {
            fornecedores.remove(selecionarFornecedor(selec));
        } else {
            System.out.println("Fornecedor não encontrado");
        }

    }

    public Fornecedor selecionarFornecedor(int cod) {

        //procura um Fornecedor pelo codigo e o devolve quando encontrá-lo
        for (Fornecedor f : fornecedores) {
            if (f.getCod() == cod) {
                return f;
            }
        }
        return null;
    }

    //Métodos para a Classe Locação
    public Locacao selecionaLocacao(int cod) {

        //retorna uma locacao atraves de um codigo especifico
        for (Locacao l : locacoes) {
            if (l.getId() == cod) {
                return l;
            }
        }
        return null;
    }

    public void registrarLocacao() throws ParseException {
        //cria uma nova locacao
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Cliente c;
        Produto p;
        System.out.println("Registrando nova locação");

        System.out.println("Data da retirada (dd/mm/aaaa) :");
        Date dataRetirada = data.parse(entrada.next());
        System.out.println("Data prevista (dd/mm/aaaa) :");
        Date dataPrevista = data.parse(entrada.next());
        do {
            System.out.println("Selecione Cliente por CPF ou CNPJ:");
            c = consultaCliente(entrada.nextInt());
        } while (c == null);
        do {
            System.out.println("Selecione produto por modelo:");
            p = selecionarProduto(entrada.next());
        } while (p == null);

        Locacao l = new Locacao(c, p, dataRetirada, dataPrevista);
        locacoes.add(l);

    }

    public void finalizarLocacao() throws ParseException {
        //termina uma locacao definindo data de termino e valor a ser pago
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Selecione a locação pelo seu codigo para finaliza-la:");
        Locacao l = selecionaLocacao(entrada.nextInt());
        System.out.println("Data da devolução(dd/mm/yyyy):");
        Date DataDevolucao = data.parse(entrada.next());
        System.out.println("Valor a ser pago referente à finalização:"
                + l.gerarValorPagar(DataDevolucao));

    }

    public void gerarRelatorio() {
        //percorre o locacao mostrando os dados de cada uma
        for (Locacao l : locacoes) {
            l.toString();
        }

    }

    //Métodos para inicializar lista de componenetes do sistema a partir de arquivos txt
    private void inicializarClientes(String file) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String linha;
            while ((linha = in.readLine()) != null) {
                String[] atribs = linha.split(":");
                if (atribs[0].equals("F")) {
                    clientes.add(new Fisico(atribs[1], Integer.parseInt(atribs[2]), atribs[3], Integer.parseInt(atribs[4])));
                } else {
                    clientes.add(new Juridico(atribs[1], Integer.parseInt(atribs[2]), atribs[3], Integer.parseInt(atribs[4])));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.exit(-1);
        }
    }

    private void inicializarProdutos(String file) {

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));

        } catch (IOException | NumberFormatException e) {
            System.exit(-1);
        }

    }

    private void inicializarFornecedores(String file) {

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));

        } catch (IOException | NumberFormatException e) {
            System.exit(-1);
        }

    }

    private void inicializarLocacoes(String file) {

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));

        } catch (IOException | NumberFormatException e) {
            System.exit(-1);
        }

    }

    //Métodos para gravar os componentes criados no arquivo txt. Estes método serão chamados no fim da execução do sistema
    public void dumpClientes() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("cliente.txt"));
            for (Cliente cliente : clientes) {
                if (cliente instanceof Fisico) {
                    out.write("F:" + ((Fisico) cliente).getNomeCompleto() + 
                            ":" + ((Fisico) cliente).getCPF() + 
                            ":" + cliente.getEndereco() + 
                            ":" + cliente.getTelefone());
                } else {
                    out.write("F:" + ((Juridico) cliente).getNomeFantasia()+ 
                            ":" + ((Juridico) cliente).getCNPJ() + 
                            ":" + cliente.getEndereco() + 
                            ":" + cliente.getTelefone());
                }
            }
        } catch (Exception ex) {
            System.exit(-1);
        }
    }

    public void dumpProdutos() {

    }

    public void dumpFornecedores() {

    }

    private void dumpLocacoes() {

    }
}
