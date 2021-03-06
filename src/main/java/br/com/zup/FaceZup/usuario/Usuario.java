package br.com.zup.FaceZup.usuario;

import br.com.zup.FaceZup.mensagem.Mensagem;

import javax.persistence.*;
import java.util.List;
//import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    private String nome;
    private String sobreNome;
    @Id
    @Column(unique = true, nullable = false)
    private String email;
    private String cargo;

   @OneToMany(mappedBy = "usuario")
    private List<Mensagem> chat;

    public Usuario(){

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

    /*public List<Menssagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Menssagem> mensagens) {
        this.m*//*ensagens = mensagens;
    }*/
}
