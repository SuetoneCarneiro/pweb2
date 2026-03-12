package br.edu.ifpb.pweb2.springioc.paragrafo;

import org.springframework.stereotype.Component;

@Component
public class GeradorParagrafoLibreOffice implements GeradorParagrafoIntf {
    public void addParagrafo(String paragrafo) {
        System.out.println("{LibreOffice}" + paragrafo + "{/LibreOffice}");
    }
}
