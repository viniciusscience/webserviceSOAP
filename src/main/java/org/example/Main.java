package org.example;


public class Main {

    private static final String EMAIL = "teste@anvisa.gov.br";
    private static final String PASSWORD = "12345678";


    public static void main(String[] args) {

        var wsSngpc = new SngpcIntegrationService();

        var result = wsSngpc.validarUsuario(EMAIL, PASSWORD);

        System.out.println(result);
    }


}

