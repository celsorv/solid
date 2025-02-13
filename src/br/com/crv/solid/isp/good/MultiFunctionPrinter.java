package br.com.crv.solid.isp.good;

public class MultiFunctionPrinter implements Printer, FaxMachine, Scanner {
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