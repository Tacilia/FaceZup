package br.com.zup.FaceZup.mensagem.dtos;

import br.com.zup.FaceZup.mensagem.Mensagem;

public class MensagemIdDTO {

    private Integer id;

    public MensagemIdDTO(){

    }

    public static Mensagem converterDTOParaModel() {
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
