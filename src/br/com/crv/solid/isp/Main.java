package br.com.crv.solid.isp;

import br.com.crv.solid.isp.good.MultiFunctionPrinter;
import br.com.crv.solid.isp.good.SimplePrinter;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nIMPRESSORA MULTIFUNCIONAL:");

        MultiFunctionPrinter multiFunctionalPrinter = new MultiFunctionPrinter();

        multiFunctionalPrinter.printDocument("Nota Fiscal");
        multiFunctionalPrinter.faxDocument("Pedido do Cliente");
        multiFunctionalPrinter.scanDocument("Documentos do Cliente");


        System.out.println("\nIMPRESSORA COMUM:");

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.printDocument("Nota Fiscal");

    }

}
