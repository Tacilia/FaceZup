package br.com.zup.FaceZup.mensagem;

import br.com.zup.FaceZup.usuario.Usuario;
import br.com.zup.FaceZup.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MensagemSevice<mensagem> {

    private MensagemRepository mensagemRepository;
    private UsuarioService usuarioService;

    @Autowired
    public MensagemSevice(MensagemRepository mensagemRepository, UsuarioService usuarioService) {
        this.mensagemRepository = mensagemRepository;
        this.usuarioService = usuarioService;
    }

    public Mensagem cadastraeMensagem(String usuarioId, Mensagem mensagem){
        Usuario usuario = usuarioService.pesquisarUsuarioPeloId(usuarioId);

        mensagem.setUsuario(usuario);
        mensagem.setDataDeEnvio(LocalDate.now());
        mensagem.setVisualizado(false);

        return mensagemRepository.save(mensagem);
    }


}
