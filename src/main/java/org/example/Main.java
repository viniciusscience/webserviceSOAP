package org.example;


import xsd2java.CtInsumoBasico;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static final String EMAIL = "teste@anvisa.go22v.br";
    private static final String PASSWORD = "123456782";


    public static void main(String[] args) throws JAXBException {
//
//        var wsSngpc = new SngpcIntegrationService();
//
//        var validarUsuario = new ValidarUsuario();
//
//        validarUsuario.setEmail(EMAIL);
//        validarUsuario.setSenha(PASSWORD);
//
//        var result = wsSngpc.validarUsuario(validarUsuario.getEmail(), validarUsuario.getSenha());
//
//
//        var validarUsuarioResponse = new ValidarUsuarioResponse();
//
//      validarUsuarioResponse.setValidarUsuarioResult(result);
//
//        System.out.println(validarUsuarioResponse.getValidarUsuarioResult());


            // Criação do objeto
            CtInsumoBasico insumo = new CtInsumoBasico();
            insumo.setCodigoInsumo("00092");
            insumo.setNumeroLoteInsumo("A315");
            insumo.setInsumoCNPJFornecedor("99900099900000");
            insumo.setQuantidadeInsumo(new BigDecimal("300000.0"));
            insumo.setTipoUnidade("1");

            // Converter o objeto em XML
            JAXBContext jaxbContext = JAXBContext.newInstance(CtInsumoBasico.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();
            marshaller.marshal(insumo, sw);
            String xml = sw.toString();

            System.out.println("XML gerado:\n" + xml);


    }


}

