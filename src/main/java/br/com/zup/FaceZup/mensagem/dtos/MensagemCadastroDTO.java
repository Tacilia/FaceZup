package br.com.zup.FaceZup.mensagem.dtos;

import br.com.zup.FaceZup.usuario.Usuario;

import java.time.LocalDate;

public class MensagemCadastroDTO {

    private Integer id;
    private String mensagem;
    private String destino;
    private String origem;


    public MensagemCadastroDTO(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
