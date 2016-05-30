package br.com.mackenzie.view;

import br.com.mackenzie.model.Controle;
import java.text.ParseException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        Controle c = new Controle();
        System.out.println(">>>Locação Mobile<<<");
        int op = 0; //primeira opção para navegar no menu

        do {//menu principal
            System.out.println("Menu principal:"
                    + "\n 1 - Alugar produto"
                    + "\n 2 - Devolver produto"
                    + "\n 3 - Gerar Relatorio de Locação"
                    + "\n 4 - Fornecedores"
                    + "\n 5 - Clientes"
                    + "\n 6 - Produtos"
                    + "\n 9 - Sair");

            op = in.nextInt();

            switch (op) {//opções do menu principal
                case 1:
                    c.registrarLocacao();
                    break;
                case 2:
                    c.finalizarLocacao();
                    break;
                case 3:
                    c.gerarRelatorio();
                    break;
                case 4:
                    System.out.println("Menu Fornecedores:");
                    int opForn = 0;

                    do {//opções do menu interno de fornecedores

                        System.out.println("\n 1 - Cadastrar Fornecedor"
                                + "\n 2 - Consultar Fornecedor por CNPJ"
                                + "\n 3 - Alterar dados de um fornecedor"
                                + "\n 4 - Deletar fornecedor"
                                + "\n 5 - Listar Todos os Fornecedores"
                                + "\n 9 - Voltar pro menu principal");
                        opForn = in.nextInt();

                        switch (opForn) {
                            case 1:
                                c.acrescentarFornecedor();
                                break;
                            case 2:
                                c.consultarFonecedor();
                                break;
                            case 3:
                                c.alterarDadosFornecedor();
                                break;
                            case 4:
                                c.excluirFornecedor();
                                break;
                            case 5:
                                c.listarFonecedores();
                                break;
                            case 9:
                                System.out.println("Retornando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }

                    } while (opForn != 9);

                    break;

                case 5:
                    System.out.println("Menu Cliente:");
                    int opCliente = 0;

                    do {

                        System.out.println("\n 1 - Cadastrar Cliente"
                                + "\n 2 - Consultar cadastro por CPF ou CNPJ"
                                + "\n 3 - Alterar dados de cliente"
                                + "\n 4 - Listar todos os clientes"
                                + "\n 9 - Voltar pro menu principal");

                        opCliente = in.nextInt();

                        switch (opCliente) {
                            case 1:
                                c.cadastrarCliente();
                                break;
                            case 2:
                                c.achaCliente();
                                break;
                            case 3:
                                c.alterarDadosCliente();
                                break;
                            case 4:
                                c.listarClientes();
                                break;
                            case 9:
                                System.out.println("Voltando para o menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }

                    } while (opCliente != 9);

                    break;
                case 6:

                    System.out.println("Menu Produtos:");
                    int opProd = 0;

                    do {

                        System.out.println("\n 1 - Criar produto"
                                + "\n 2 - Consultar produtos disponíveis"
                                + "\n 3 - Deletar produto"
                                + "\n 4 - Alterar dados de produto"
                                + "\n 9 - Voltar para o menu");

                        opProd = in.nextInt();

                        switch (opProd) {
                            case 1:
                                c.acrescentarProduto();
                                break;
                            case 2:
                                c.visualizarProdutos();
                                break;
                            case 3:
                                c.excluirProduto();
                                break;
                            case 4:
                                c.alterarDadosProduto();
                                break;
                            case 9:
                                System.out.println("Voltando para o menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }

                    } while (opProd != 9);

                    break;
                case 9:
                    c.dumpClientes();
                    c.dumpFornecedores();
                    c.dumpProdutos();
                    c.dumpLocacoes();
                    System.out.println("Finalizando programa!");
                    break;
                default:
                    System.out.println("Opção não existente");
            }

        } while (op != 9);

    }
}
