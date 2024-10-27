package org.example;

import sngpc.webservice.*;

import java.util.function.Supplier;

public class SngpcIntegrationService implements SngpcSoap {

    private static final SngpcSoap wsSngpc;

    static {
        try {
            wsSngpc = new Sngpc().getSngpcSoap();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String enviaArquivoSNGPC(String email, String senha, byte[] arq, String hashIdentificacao) {

        return tryAndGetResult(() -> wsSngpc.enviaArquivoSNGPC(email, senha, arq, hashIdentificacao));


    }

    @Override
    public String validarUsuario(String email, String senha) {

        return tryAndGetResult(() -> wsSngpc.validarUsuario(email, senha));


    }

    @Override
    public String consultaDadosArquivoSNGPC(String email, String senha, String cnpj, String hash) {
        return tryAndGetResult(() -> wsSngpc.consultaDadosArquivoSNGPC(email, senha, cnpj, hash));


    }


    private <T> T tryAndGetResult(Supplier<T> supplier) {

        try {
            return supplier.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

