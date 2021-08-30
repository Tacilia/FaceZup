package br.com.zup.FaceZup.mensagem.dtos;

import br.com.zup.FaceZup.usuario.Usuario;

import java.time.LocalDate;

public class MensagemCadastroDTO {

    private String mensagem;

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
