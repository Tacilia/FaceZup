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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setUsuario(Usuario usuario) {
    }

    public void setDataDeEnvio(LocalDate now) {
    }

    public void setVisualizado(boolean b) {
    }
}
