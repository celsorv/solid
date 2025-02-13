package br.com.crv.solid.isp.bad;

public class MultiFunctionPrinter implements Printer {
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }

    public void faxDocument(String content) {
        System.out.println("Faxing document: " + content);
    }

    public void scanDocument(String content) {
        System.out.println("Scanning document: " + content);
    }
}