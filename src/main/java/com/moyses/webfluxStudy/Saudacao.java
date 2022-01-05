package com.moyses.webfluxStudy;

public class Saudacao {

    private String mensagem;

    public Saudacao(){
    }

    public Saudacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Saudacao{" +
                "mensagem='" + mensagem + '\'' +
                '}';
    }
}
