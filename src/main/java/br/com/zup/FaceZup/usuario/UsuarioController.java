package br.com.zup.FaceZup.usuario;

import br.com.zup.FaceZup.usuario.dtos.UsuarioCadastroDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper conversorDTO;

    @PostMapping
    public Usuario salvarUsuario(@RequestBody UsuarioCadastroDTO usuarioCadastroDTO){
        Usuario usuario = conversorDTO.map(usuarioCadastroDTO, Usuario.class);
        usuarioService.salvarrUsuario(usuario);
        return usuario;
    }
    @GetMapping
    public List<Usuario> exibirTodosOsUsuario(){
        return usuarioService.exibirTodosOsUsuarios();
    }












    /*@ResponseStatus(HttpStatus.CREATED)
    public Usuario cadastrarUsuario(@RequestBody UsuarioCadastroDTO usuarioDTO){
        return usuarioService.salvarrUsuario(modelMapper.map(usuarioDTO, Usuario.class));
    }*/
}
