package br.com.zup.FaceZup.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarrUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
