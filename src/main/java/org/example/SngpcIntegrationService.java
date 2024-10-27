package org.example;

import sngpc.webservice.*;

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
        try {
            return wsSngpc.enviaArquivoSNGPC(email, senha, arq, hashIdentificacao);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String validarUsuario(String email, String senha) {

        try {
            return wsSngpc.validarUsuario(email, senha);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String consultaDadosArquivoSNGPC(String email, String senha, String cnpj, String hash) {

        try {
            return wsSngpc.consultaDadosArquivoSNGPC(email, senha, cnpj, hash);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

