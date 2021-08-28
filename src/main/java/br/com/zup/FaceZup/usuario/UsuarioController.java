package br.com.zup.FaceZup.usuario;

import br.com.zup.FaceZup.usuario.dtos.AtualizarUsuarioDTO;
import br.com.zup.FaceZup.usuario.dtos.UsuarioCadastroDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper conversorDTO;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario slvarrUsuario(@RequestBody UsuarioCadastroDTO usuarioCadastroDTO){
        Usuario usuario = conversorDTO.map(usuarioCadastroDTO, Usuario.class);
        usuarioService.salvarUsuario(usuario);
        return usuario;
    }
    @GetMapping
    public List<Usuario> exibirTodosOsUsuario(){
        return usuarioService.exibirTodosOsUsuarios();
    }
    @GetMapping("/{pesquisarEmail}")
    public Usuario pesquisarUsuarioPeloId(@PathVariable(name = "pesquisarEmail") String id) {
        Usuario usuario;

        try {
            usuario = usuarioService.pesquisarUsuarioPeloId(id);
            return usuario;
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
    @PutMapping
    public Usuario atualizarUsuario(@RequestBody AtualizarUsuarioDTO atualizarUsuarioDTO){
        ObjectMapper objectMapper = new ObjectMapper();
        Usuario objetoConvertido = objectMapper.convertValue(atualizarUsuarioDTO, Usuario.class);

        if(!usuarioService.usuarioExistente(objetoConvertido.getEmail())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario não encontrado");
        }
        return usuarioService.salvarUsuario(objetoConvertido);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPeloID(@PathVariable String id){
        usuarioService.deletarPorID(id);
    }
}
