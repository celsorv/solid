package br.com.crv.solid.isp.bad;

class SimplePrinter implements Printer {
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }

    public void faxDocument(String content) {
        // Não faz fax, mas é obrigado a implementar o método
    }

    public void scanDocument(String content) {
        // Não faz scan, mas é obrigado a implementar o método
    }
}