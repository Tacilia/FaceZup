package br.com.zup.FaceZup.mensagem.dtos;

import br.com.zup.FaceZup.mensagem.Mensagem;

public class MensagemIdDTO {

    private String id;

    public MensagemIdDTO(){

    }

    public static Mensagem converterDTOParaModel(){
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
