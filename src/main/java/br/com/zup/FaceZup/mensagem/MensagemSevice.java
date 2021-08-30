package br.com.zup.FaceZup.mensagem;

import br.com.zup.FaceZup.usuario.Usuario;
import br.com.zup.FaceZup.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MensagemSevice<mensagem> {

    private MensagemRepository mensagemRepository;
    private UsuarioService usuarioService;

    @Autowired
    public MensagemSevice(MensagemRepository mensagemRepository, UsuarioService usuarioService) {
        this.mensagemRepository = mensagemRepository;
        this.usuarioService = usuarioService;
    }

    public Mensagem cadastraeMensagem(String usuarioId, Mensagem mensagem) {
        Usuario usuario = usuarioService.pesquisarUsuarioPeloId(usuarioId);

        mensagem.setUsuario(usuario);
        mensagem.setDataDeEnvio(LocalDate.now());
        mensagem.setVisualizado(false);

        return mensagemRepository.save(mensagem);
    }

    public Mensagem pesquisarMnensagemPorId(String id){
        Optional<Mensagem> mensagemOptional = mensagemRepository.findById(id);

        if (mensagemOptional.isPresent()){
            return mensagemOptional.get();
        }
        throw new RuntimeException("Mensagem não encontrada");
    }
    public Mensagem visualizarMensagemPorId(String id){
        Mensagem mensagem = pesquisarMnensagemPorId(id);

        mensagem.setVisualizado(true);
        mensagemRepository.save(mensagem);
        return mensagem;
    }

    public List<Mensagem> filtrarMensagem(String emailUsuario,Boolean visualizado){
        if(emailUsuario != null){
            return mensagemRepository.findAllByEmailContains(emailUsuario);
        }
        if (visualizado != null){
            return mensagemRepository.findAlllByVisualizado(visualizado);
        }
        return (List<Mensagem>) mensagemRepository.findAll();
    }
}
