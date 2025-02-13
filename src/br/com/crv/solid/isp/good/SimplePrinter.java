package br.com.crv.solid.isp.good;

public class SimplePrinter implements Printer {
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }
}
