package br.com.zup.FaceZup.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> exibirTodosOsUsuarios(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
    public boolean usuarioExistente(String id){
        return usuarioRepository.existsById(id);
    }
    public Usuario pesquisarUsuarioPeloId(String id){
        Optional<Usuario> contatoOptional = usuarioRepository.findById(id);

        if (contatoOptional.isPresent()){
            return contatoOptional.get();
        }
        throw new RuntimeException("Usuario não encontrado");
    }
    public void deletarPorID(String id){
        usuarioRepository.deleteById(id);
    }
}
