package br.edu.ifpb.pweb2.springioc.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.edu.ifpb.pweb2.springioc.configuration.DocumentGeneratorConf;
import br.edu.ifpb.pweb2.springioc.gerador.GeradorDocumentoIntf;

public class GeradorTextosApp {


    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            DocumentGeneratorConf.class);
            GeradorDocumentoIntf gerador = context.getBean(GeradorDocumentoIntf.class);

            gerador.addTexto("Bom");
            gerador.addTexto("dia!");

            context.close();
    }
}
