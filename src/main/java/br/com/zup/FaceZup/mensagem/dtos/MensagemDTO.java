package br.com.zup.FaceZup.mensagem.dtos;

import br.com.zup.FaceZup.mensagem.Mensagem;
import br.com.zup.FaceZup.usuario.dtos.UsuarioDTO;

import java.time.LocalDate;

public class MensagemDTO {
    private Integer id;
    private String mensagem;
    private LocalDate dataDeEnvio;
    private boolean visualizado;

    private UsuarioDTO usuarioDTO;

    public MensagemDTO(){

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

    public LocalDate getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(LocalDate dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }

    public static MensagemDTO converterModelParaDTO(Mensagem mensagem){
        MensagemDTO mensagemDTO = new MensagemDTO();
        UsuarioDTO usuarioDTO = UsuarioDTO.converterModelParaDTO(mensagem.getUsuario());

        mensagemDTO.setUsuarioDTO(usuarioDTO);
        mensagemDTO.setMensagem(mensagem.getMensagem());
        mensagemDTO.setVisualizado(mensagem.isVisualizado());
        mensagemDTO.setDataDeEnvio(mensagem.getDataDeEnvio());
        mensagemDTO.setId(mensagem.getId());

        return mensagemDTO;
    }
}
