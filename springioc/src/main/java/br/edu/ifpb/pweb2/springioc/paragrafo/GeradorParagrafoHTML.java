package br.edu.ifpb.pweb2.springioc.paragrafo;

import org.springframework.stereotype.Component;

@Component
public class GeradorParagrafoHTML implements GeradorParagrafoIntf{
    public void addParagrafo(String paragrafo) {
        System.out.println("<p>" + paragrafo + "</p>");
    }
}
