package br.com.crv.solid.isp.bad;

public interface Printer {
    void printDocument(String content);
    void faxDocument(String content);
    void scanDocument(String content);
}