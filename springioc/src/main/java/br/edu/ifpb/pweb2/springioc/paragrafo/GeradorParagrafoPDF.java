package br.edu.ifpb.pweb2.springioc.paragrafo;

import org.springframework.stereotype.Component;

@Component
public class GeradorParagrafoPDF implements GeradorParagrafoIntf {

    @Override
    public void addParagrafo(String paragrafo) {
        System.out.println("{PDF}" + paragrafo + "{/PDF}");
    }

}
