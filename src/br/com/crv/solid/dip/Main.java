package br.com.crv.solid.dip;

import br.com.crv.solid.dip.good.Boleto;
import br.com.crv.solid.dip.good.CartaoDeCredito;
import br.com.crv.solid.dip.good.PagamentoMetodo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de pagamento:");
        System.out.println("1 - Boleto");
        System.out.println("2 - Cartão de Crédito");


        int escolha = scanner.nextInt();


        PagamentoMetodo pagamentoMetodo = null;


        switch (escolha) {
            case 1:
                pagamentoMetodo = new Boleto();
                break;
            case 2:
                pagamentoMetodo = new CartaoDeCredito();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nRealizando o pagamento:");
        pagamentoMetodo.realizarPagamento();

    }

}
