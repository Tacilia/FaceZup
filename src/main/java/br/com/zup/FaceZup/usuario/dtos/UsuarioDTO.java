package br.com.zup.FaceZup.usuario.dtos;

import br.com.zup.FaceZup.usuario.Usuario;

public class UsuarioDTO {

    private String nome;
    private String sobreNome;
    private String email;
    private String cargo;

    public UsuarioDTO(){

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public static UsuarioDTO converterModelParaDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setNome(usuario.getNome());
        usuarioDTO.setSobreNome(usuario.getSobrenome());
        usuarioDTO.setCargo(usuario.getCargo());
        return usuarioDTO;
    }
}
