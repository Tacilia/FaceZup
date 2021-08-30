package br.com.zup.FaceZup.usuario.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class UsuarioCadastroDTO {

    @Min(value = 3, message = "{validacao.nome.usuario.minimo}")
    @Max(value = 25, message = "{validacao.nome.usuario.maximo}")
    private String nome;
    @Min(value = 3, message = "{validacao.nome.usuario.minimo}")
    @Max(value = 25, message = "{validacao.nome.usuario.maximo}")
    private String sobreNome;
    @Email (message = "validacao.email.usuario}")
    private String email;
    private String cargo;

    public UsuarioCadastroDTO(){

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
