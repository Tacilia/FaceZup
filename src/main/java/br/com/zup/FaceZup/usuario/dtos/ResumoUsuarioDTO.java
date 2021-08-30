package br.com.zup.FaceZup.usuario.dtos;

import br.com.zup.FaceZup.usuario.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class ResumoUsuarioDTO {

    private String email;
    private String nome;
    private String sobreNome;

    public ResumoUsuarioDTO(String emai, String nome, String sobreNome){
        this.email = emai;


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public static List<ResumoUsuarioDTO> converterListaDeModelParaDTO(List<Usuario> usuarios){
        return usuarios.stream()
                .map(usuario -> new ResumoUsuarioDTO(
                        usuario.getEmail(),
                        usuario.getNome(),
                        usuario.getSobrenome())
                ).collect(Collectors.toList());
    }
}
