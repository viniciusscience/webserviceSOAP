package org.example;


import sngpc.webservice.ValidarUsuario;
import sngpc.webservice.ValidarUsuarioResponse;

public class Main {

    private static final String EMAIL = "teste@anvisa.gov.br";
    private static final String PASSWORD = "12345678";


    public static void main(String[] args) {

        var wsSngpc = new SngpcIntegrationService();

        var validarUsuario = new ValidarUsuario();

        validarUsuario.setEmail(EMAIL);
        validarUsuario.setSenha(PASSWORD);

        var result = wsSngpc.validarUsuario(validarUsuario.getEmail(), validarUsuario.getSenha());


        var validarUsuarioResponse = new ValidarUsuarioResponse();

        validarUsuarioResponse.setValidarUsuarioResult(result);

        System.out.println(validarUsuarioResponse.getValidarUsuarioResult());
    }


}

