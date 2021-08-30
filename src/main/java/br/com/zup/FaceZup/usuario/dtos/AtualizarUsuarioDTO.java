package br.com.zup.FaceZup.usuario.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AtualizarUsuarioDTO {

    private String nome;
    private String sobreNome;
    @NotNull(message = "Id obrigatorio")
    @Size(message = "Minimo 10 letras", min = 10)
    @Email(message = "Email fora do padrão")
    private String email;
    private String cargo;

    public AtualizarUsuarioDTO(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobreNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobreNome = sobrenome;
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
}
